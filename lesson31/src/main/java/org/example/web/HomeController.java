package org.example.web;

import org.example.domain.Phone;
import org.example.exception.PhoneNameException;
import org.example.exception.ValueException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String homePage () {
        return "home";
    }

    @PostMapping
    public String createPhone (Phone phone) {
        String model = phone.getModel();

        if (model.equals("lg") || model.equals("sony")){
            throw new PhoneNameException(phone);
        }
        if (phone.getValue() < 1000) {
            throw new ValueException(phone);
        }

        return "home";
    }
}

