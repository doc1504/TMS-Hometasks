package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.domain.Phone;
import org.example.service.PhoneService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public ModelAndView homePage(@ModelAttribute(name = "phone")Phone phone) {
        ModelAndView modelAndView = new ModelAndView("home");

        return modelAndView;
    }

    @PostMapping
    public ModelAndView createPhone (@ModelAttribute(name = "phone") @Valid Phone phone, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView("home");
        if (!result.hasFieldErrors()) {
            phoneService.save(phone);
            modelAndView.addObject("phone", new Phone());

        }
        modelAndView.addObject("phones", phoneService.getPhones());
        return modelAndView;

    }
}
