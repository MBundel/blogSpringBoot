package com.example.blogproject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserService {
    @Autowired
    UserDAO userDAO;

    public List<User> getAll(){
        return new ArrayList<>(userDAO.findAll());
    }

    public User getUserById(int id){
        return userDAO.findById(id).get();
    }
    public  boolean saveOrUpdated(User user){
       User updatedUser =  userDAO.save(user);
        return userDAO.findById(updatedUser.getId()).isPresent();
    }

    public boolean delete(int id){
        userDAO.deleteById(id);
        return userDAO.findById(id).isPresent();
    }


}
