
package com.example.blogproject.user;

import com.example.blogproject.comments.Comment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Einkommentieren, wenn DAO existiert:
// @Entity
public class User {
    @Id
    @Getter
    @Setter
    private int id;

    // Wahrscheinlich nicht sinnvoll:
    // @OneToMany //  hier MappedByBlog?
    // @Setter
    // @Getter
    // List<Comment> userComments;

    @Getter
    @Setter
    private String userName;

    @Getter
    @Setter
    private String password;


    // Wie User mit Comment verknüpfen?


    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

