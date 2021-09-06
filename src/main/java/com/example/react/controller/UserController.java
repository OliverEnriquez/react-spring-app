package com.example.react.controller;

import com.example.react.dao.UserDao;
import com.example.react.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/users")
    public List<Users> getUsers() {
        return userDao.getUsers();
    }

    @GetMapping("/count/users")
    public Long countUsers() {
        return userDao.countUsers();
    }
}
