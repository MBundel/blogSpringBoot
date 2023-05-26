package com.example.blogproject.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BlogController {
    private final BlogService blogService;
    private List<Blog> blogs;

    @Autowired
    private BlogController(BlogService theBlogService){
        this.blogService = theBlogService;
    }

    @GetMapping(value = "/")
    public String showFullBlog(Model model){
        blogs = blogService.getBlogEntries();
        model.addAttribute("blogs", blogs);
        return "/blog";
    }

}