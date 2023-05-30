package com.example.blogproject.comments;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


@Entity
public class Comment {



//    @ManyToOne
//    @JoinColumn(name = "blog_id")
//    private Blog blog;

@Getter
@Setter
    String text = "moin";
    @Id
    private Long id;

    public Comment() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Getter
    @Setter
    LocalDate timeStamp;
    @Getter
    @Setter
    String user;

    public Comment(String text, LocalDate timeStamp, String user) {
        this.text = text;
        this.timeStamp = timeStamp;
        this.user = user;
    }





}
