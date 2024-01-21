package com.example.security48.web;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequiredArgsConstructor
@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/public")
    public String publicPage() {
        return "public";
    }
    @GetMapping("/private")
    public String privatePage() {
        return "private";
    }
    @GetMapping("/goodbye")
    public String goodbye() {
        return "goodbye";
    }
}
