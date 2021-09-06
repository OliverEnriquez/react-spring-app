package com.example.react.dao;

import com.example.react.domain.Users;

import java.util.List;

public interface UserDao {

    public List<Users> getUsers();
    public Long countUsers();

}
