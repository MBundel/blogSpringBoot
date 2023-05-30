package com.example.blogproject.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping(value = "/newest")
    public String sortedByNewestDate(Model model){
        blogs = blogService.getBlogEntries().stream()
                .sorted(Comparator.comparing(Blog::getTimeStamp))
                .collect(Collectors.toList());
        model.addAttribute("blogs", blogs);
        return "/blog";
    }
    @GetMapping(value = "/oldest")
    public String sortedByOldestDate(Model model){
        blogs = blogService.getBlogEntries().stream()
                .sorted(Comparator.comparing(Blog::getTimeStamp).reversed())
                .collect(Collectors.toList());
        model.addAttribute("blogs", blogs);
        return "/blog";
    }

}