package com.example.blogproject.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SuccessController {

    @GetMapping(value = "/registered")
    public String showRegistrationForm() {
        return "/success";
    }


}
