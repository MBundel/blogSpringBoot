package com.example.blogproject.admin;

import com.example.blogproject.blog.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends JpaRepository<Blog, Integer> {
}
