package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.domain.Phone;
import org.example.service.PhoneService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@RequestMapping("/home")
public class HomeController {
    private final PhoneService phoneService;

    @GetMapping
    public String homePage() {
        return "home";
    }

    @PostMapping
    public ModelAndView createBook(@Valid Phone phone, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView("home");
        if (result.hasFieldErrors()) {
            result.getFieldErrors()
                    .forEach(fieldError -> {
                        String field = fieldError.getField();
                        String defaultMessage = fieldError.getDefaultMessage();
                        modelAndView.addObject(field + "Error", defaultMessage);
                    });
        }
        if (!result.hasFieldErrors()) {
            phoneService.save(phone);
        }
        modelAndView.addObject("phones", phoneService.getPhones());
        return modelAndView;
    }
}
