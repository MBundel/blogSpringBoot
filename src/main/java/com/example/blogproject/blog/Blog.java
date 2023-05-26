package com.example.blogproject.blog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Entity
public class Blog {

    @Id
    @Getter
    @Setter
    Integer id;

    @Getter
    @Setter
    String blogName;

    public Blog(){}
}
