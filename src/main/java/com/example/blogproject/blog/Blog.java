package com.example.blogproject.blog;

import com.example.blogproject.comments.Comment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import lombok.Setter;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@Entity

public class Blog {

    @OneToMany //  hier MappedByBlog?
    @Setter
    @Getter
    List<Comment> comments;

    @Id
    @GeneratedValue
    @Getter
    @Setter

    long id;

    @Setter
    @Getter
    String Header;

    @Getter
    @Setter
    LocalDate timeStamp = LocalDate.of(2023, 01,01);

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
    public  void sortCommentsByLatest(){

    }

}
