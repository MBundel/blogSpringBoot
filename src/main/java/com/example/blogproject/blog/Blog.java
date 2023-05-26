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

    @Getter
    String blogName;

    @Getter
    LocalDate timeStamp;

    @Getter
    String text;

    public Blog(){}
}
