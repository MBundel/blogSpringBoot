
package com.example.blogproject.user;

import com.example.blogproject.comments.Comment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Einkommentieren, wenn DAO existiert:
@Entity
@Table(name = "my_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

// TODO Wie User mit Comment verknüpfen?
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


    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}

