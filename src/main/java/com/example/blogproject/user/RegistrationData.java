package com.example.blogproject.user;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
public class RegistrationData {


    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Only letters, digits and underscores allowed.")
    private String username;

    @Size(min = 5, message = "Your password must have at least 5 characters.")
    private String password1;

    private String password2;

    public RegistrationData(String username, String password1, String password2) {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }
}
