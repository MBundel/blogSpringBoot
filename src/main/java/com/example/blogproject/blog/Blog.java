package com.example.blogproject.blog;

import com.example.blogproject.comments.Comment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import lombok.Setter;


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


    public Blog(){}

    public Blog(String header, LocalDate timeStamp, String text) {
        Header = header;
        this.timeStamp = timeStamp;
        this.text = text;
        comments = new ArrayList<>();
        addDefaultComment();

    }
    private  void  addDefaultComment(){
        comments.add(new Comment("Hallo", LocalDate.of(2023, 5, 12),"SweetBabe"));
    }

}
