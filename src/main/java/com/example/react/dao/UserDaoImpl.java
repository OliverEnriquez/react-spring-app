package com.example.react.dao;

import com.example.react.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    EntityManager entityManager;

    public List<Users> getUsers() {
        String query = "SELECT user FROM Users user";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Long countUsers() {
        String query = "SELECT count(1) FROM Users";
        return (Long) entityManager.createQuery(query).getSingleResult();
    }
}
