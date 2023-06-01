
package com.example.blogproject.user;

import com.example.blogproject.comments.Comment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Einkommentieren, wenn DAO existiert:
// @Entity
public class User {
    @Id
    @GeneratedValue
    @Getter
    private long id;


    // Wahrscheinlich nicht sinnvoll:
    // @OneToMany //  hier MappedByBlog?
    // @Setter
    // @Getter
    // List<Comment> userComments;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;




    // TODO Wie User mit Comment verknüpfen?


    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}

