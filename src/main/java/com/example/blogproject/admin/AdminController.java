package com.example.blogproject.admin;


import com.example.blogproject.blog.Blog;
import com.example.blogproject.blog.BlogDAO;
import com.example.blogproject.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    private final AdminService adminService;

    @Autowired
    private AdminController(AdminService adminService){
        this.adminService = adminService;
    }
    @PostMapping("/submit")
    public <FormObject> String submitForm(@ModelAttribute("formObject") FormObject formObject) {
        Blog blog = new Blog();
//        blog.setHeader(formObject.getHeader());
//        blog.setText(formObject.getText());
//        blog.setTimeStamp(formObject.getTimeStamp());
//        blog.setNoIdea(formObject.getNoIdea());
//
//        BlogDAO.save(blog);

        return "success-page";
    }

}
