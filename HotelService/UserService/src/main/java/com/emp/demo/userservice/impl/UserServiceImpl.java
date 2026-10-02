package com.emp.demo.userservice.impl;

import com.emp.demo.userservice.entity.User;
import com.emp.demo.userservice.exception.UserNotFoundExcpetion;
import com.emp.demo.userservice.repository.UserRepo;
import com.emp.demo.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
        List<User>  allUsers=userRepo.findAll();
        return allUsers;
    }

    @Override
    public User getOneUser(String id) {
        Optional<User> u=userRepo.findById(id);//11
        return u.orElseThrow(()-> new UserNotFoundExcpetion("User not present in id : "+id));
    }

    @Override
    public User createUser(User u) {
        User u1=userRepo.save(u);
        return u1;
    }

    @Override
    public boolean updateUser(String id, User u) {
        Optional<User> u1 = userRepo.findById(id);
        User u2= u1.get();
        u2=u;
        User u3 = userRepo.save(u2);
        return true;
    }

    @Override
    public boolean deleteUser(String id) {
        userRepo.deleteById(id);
        return false;
    }
}
