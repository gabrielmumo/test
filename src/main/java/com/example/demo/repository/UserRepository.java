package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {


    public void createUser(String userName) {
        System.out.println("UserRepository user created");
    }
}
