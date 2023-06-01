
package com.example.blogproject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {


     private final UserService userService;

     @Autowired

     public UserController(UserService userService) {
        this.userService = userService;
    }


    // Brauchen wir wahrscheinlich nicht:
    // private List<Comment> userComments = new ArrayList<>();

    // Haben noch keinen UserService:
    // @Autowired
    // private UserController(UserService theUserService) {
    // this.userService =theUserService;
    // }

    @GetMapping(value = "/register")
    public String showRegistrationForm() {
        return "/user_registration";
    }

    // @PostMapping
    // public String
    // Methode erstellen

}

