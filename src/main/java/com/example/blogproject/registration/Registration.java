package com.example.blogproject.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Registration {
    //

    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String registrationName;

    @Getter
    @Setter
    private String registrationPassword;

    public Registration() {
    }

    public Registration(String registrationName, String registrationPassword) {
        this.registrationName = registrationName;
        this.registrationPassword = registrationPassword;
    }
}
