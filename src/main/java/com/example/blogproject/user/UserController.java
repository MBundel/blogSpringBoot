
package com.example.blogproject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    List<User> userList = new ArrayList<>();


//     private final UserService userService;
//
//     @Autowired
//
//     public UserController(UserService userService) {
//        this.userService = userService;
//    }


    // Brauchen wir wahrscheinlich nicht:
    // private List<Comment> userComments = new ArrayList<>();

    // Haben noch keinen UserService:
    // @Autowired
    // private UserController(UserService theUserService) {
    // this.userService =theUserService;
    // }

    @GetMapping(value = "/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new RegistrationData("", "", ""));
        return "user_registration";
    }

    // An Zwitscher-App orientiert:
    @PostMapping(value="/register")
    public String register(@Valid @ModelAttribute("registration") RegistrationData registration, BindingResult bindingResult) {

        if(!registration.getPassword1().equals(registration.getPassword2())) {
            bindingResult.addError(new FieldError("registration", "password2", "The passwords are not matching."));
            System.out.println("Passwörter stimmen nicht überein!");
        }
        /*
        // TODO: schauen, ob Verknüpfung zu DAO funktioniert:
       if(userService.existsByUsername(registration.getUsername())) {
            bindingResult.addError(new FieldError("registration", "username", "Username already in use."));
       }
       */

       if(bindingResult.hasErrors()) {
           System.out.println("Irgendwas stimmt nicht!");
           return "redirect:/register";
       }
       // Wenn Registrierung funktioniert hat:
       User user = new User(registration.getUsername(), registration.getPassword1());
       // TODO: klappt Verbindung zu DAO? Funktioniert das? Eigentlich: userService.save(user);
        userList.add(user);
        // Zur Kontrolle, ob User gespeichert werden:
        for(User u : userList) {
            System.out.println("User: " + u.getId() + " " + u.getUsername() + " " + u.getPassword());
        }
        System.out.println("Die Methode wurde ausgeführt.");
//       userService.saveOrUpdated(user);
       return "redirect:/registered";
    }

}

