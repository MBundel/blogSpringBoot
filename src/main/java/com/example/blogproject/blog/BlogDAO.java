package com.example.blogproject.blog;

import com.example.blogproject.blog.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogDAO extends JpaRepository<Blog, Integer> {
        List<Blog> findAll();
}