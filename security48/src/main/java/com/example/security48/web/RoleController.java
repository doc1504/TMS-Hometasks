package com.example.security48.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class RoleController {
    @GetMapping("/user")
    public String user() {
        return "user";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
