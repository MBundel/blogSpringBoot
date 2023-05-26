package com.example.blogproject.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
@Autowired
BlogDAO blogDAO;


// for admins
    public  void createNewBlog(Blog blog){blogDAO.save(blog);}

    public List<Blog> getBlogEntries(){return blogDAO.findAll(); }
}
