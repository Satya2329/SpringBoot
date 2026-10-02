package com.emp.demo.userservice.service;

import com.emp.demo.userservice.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getOneUser(String id);
    User createUser(User u);
    boolean updateUser(String id,User u);
    boolean deleteUser(String  id);
}
