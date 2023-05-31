package com.example.blogproject.registration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegistrationController {

    private List<Registration> registrations = new ArrayList<>();

    @GetMapping(value = "/registration")
    public String showRegistration(Model model) {
        addRegistration();

        model.addAttribute("registrations", registrations);
        return "/registration";
    }

    public void addRegistration(){
        registrations.add(new Registration("Julia", "hallöletöle"));
        registrations.add(new Registration("Michel", "moinsen"));
        registrations.add(new Registration("Mirjam", "huhuuu"));
    }
}
