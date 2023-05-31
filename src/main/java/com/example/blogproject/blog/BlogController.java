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

        blogs.add(new Blog("Header1", LocalDate.of(2023, 5, 30) , "text1", "https://static.wixstatic.com/media/24436a_c1c4dd20570b4da0a6c5dcaaeee3dae5~mv2.jpg/v1/fill/w_1239,h_826,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/24436a_c1c4dd20570b4da0a6c5dcaaeee3dae5~mv2.jpg" ));
        blogs.add(new Blog("Header2", LocalDate.of(2023, 5, 31) , "text2", "https://static.wixstatic.com/media/24436a_e539effc54c5448c93f53fd452655aad~mv2.jpg/v1/fill/w_1239,h_826,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/24436a_e539effc54c5448c93f53fd452655aad~mv2.jpg" ));
        blogs.add(new Blog("Fina & Lena", LocalDate.of(2018, 8 , 20), "dies das Ananas", "https://static.wixstatic.com/media/24436a_d860fcfeb8c64fbcb691a257507017cc~mv2.jpg/v1/fill/w_551,h_826,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/24436a_d860fcfeb8c64fbcb691a257507017cc~mv2.jpg"));
    }

}