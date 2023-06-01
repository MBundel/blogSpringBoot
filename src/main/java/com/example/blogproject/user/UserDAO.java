package com.example.blogproject.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    Optional<User> findByUsernameAndPassword(String username, String password);
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}

