package com.example.blogproject.blog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
@Entity
public class Blog {

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
    }
}
