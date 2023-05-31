package com.example.blogproject.blog;

import com.example.blogproject.comments.Comment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import lombok.Setter;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity

public class Blog {

    @OneToMany //  hier MappedByBlog?
    @Setter
    @Getter
    List<Comment> comments;

    @Id
    @Getter

    Integer id;

    @Setter
    @Getter
    String Header;

    @Getter
    @Setter
    LocalDate timeStamp;

    @Getter
    @Setter
    String text;

    @Getter
    @Setter
    String url;




    public Blog(){}

    public Blog(String header, LocalDate timeStamp, String text, String url) {
        Header = header;
        this.timeStamp = timeStamp;
        this.text = text;
        this.url = url;
        comments = new ArrayList<>();


    }
    public   void  addComment(Comment comment){
        comments.add(comment);


    }

}
