package com.example.security48.web;
import com.example.security48.domain.PersonDto;
import com.example.security48.service.DBUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequiredArgsConstructor
@Controller
@RequestMapping
public class UserController {
    private final DBUserDetailsService service;
    @PostMapping("/register")
    public String save (PersonDto dto) {
        service.save(dto);
        return "public";
    }
}
