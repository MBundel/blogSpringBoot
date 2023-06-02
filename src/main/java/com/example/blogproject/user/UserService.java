package com.example.blogproject.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    // Field injection zu constructor injection umgewandelt.
    private UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getAll(){
        return new ArrayList<>(userDAO.findAll());
    }

    public User getUserById(long id){
        return userDAO.findById(id).get();
    }

    public  boolean saveOrUpdated(User user){
       User updatedUser =  userDAO.save(user);
        return userDAO.findById(updatedUser.getId()).isPresent();
    }



    public boolean delete(long id){
        userDAO.deleteById(id);
        return userDAO.findById(id).isPresent();
    }


    public boolean existsByUsername(String username) {
        if(userDAO.findByUsername(username) != null) {
            return true;
        }
        return false;
    }

}
