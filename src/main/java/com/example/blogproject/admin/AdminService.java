package com.example.blogproject.admin;

import com.example.blogproject.blog.Blog;
import com.example.blogproject.blog.BlogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    BlogDAO blogDAO;

    public  void createNewBlog(Blog blog){blogDAO.save(blog);}
}
