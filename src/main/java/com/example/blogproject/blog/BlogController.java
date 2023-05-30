package com.example.blogproject.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BlogController {
    private final BlogService blogService;

    private List<Blog> blogs = new ArrayList<>();





    @Autowired
    private BlogController(BlogService theBlogService){
        this.blogService = theBlogService;
    }

    @GetMapping(value = "/")
    public String showFullBlog(Model model){
        addBlogs();
//        blogs = blogService.getBlogEntries();
        model.addAttribute("blogs", blogs);
        return "/blog";
    }

    @GetMapping(value = "/oldest")
    public String sortedByNewestDate(Model model){
       blogs =  blogs.stream().sorted(Comparator.comparing(Blog::getTimeStamp))
                .collect(Collectors.toList());


//
//        blogs = blogService.getBlogEntries().stream()
//                .sorted(Comparator.comparing(Blog::getTimeStamp))
//                .collect(Collectors.toList());
        model.addAttribute("blogs", blogs);
        return "/blog";
    }
    @GetMapping(value = "/newest")
    public String sortedByOldestDate(Model model){
        blogs =  blogs.stream().sorted(Comparator.comparing(Blog::getTimeStamp).reversed())
                .collect(Collectors.toList());
//        blogs = blogService.getBlogEntries().stream()
//                .sorted(Comparator.comparing(Blog::getTimeStamp).reversed())
//                .collect(Collectors.toList());
        model.addAttribute("blogs", blogs);
        return "/blog";
    }


    public void addBlogs(){

        blogs.add(new Blog("Header1", LocalDate.of(2023, 5, 30) , "text1" ));
        blogs.add(new Blog("Header2", LocalDate.of(2023, 5, 31) , "text2" ));

    }

}