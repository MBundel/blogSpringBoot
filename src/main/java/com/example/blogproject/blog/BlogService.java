package com.example.blogproject.blog;

import com.example.blogproject.user.User;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
@Autowired
BlogDAO blogDAO;


// for admins
    public  void createNewBlog(Blog blog){blogDAO.save(blog);}

    public List<Blog> getBlogEntries(){return blogDAO.findAll(); }



    public List<Blog> getAll(){
        return new ArrayList<>(blogDAO.findAll());
    }

    public Blog getUserById(long id){
        return blogDAO.findById(id).get();
    }
    public  boolean saveOrUpdated(Blog blog){
        Blog updatedBlog =  blogDAO.save(blog);
        return blogDAO.findById(Long.valueOf(updatedBlog.getId())).isPresent();
    }

    public boolean delete(long id){
        blogDAO.deleteById(id);
        return blogDAO.findById(id).isPresent();
    }
}
