package com.emp.demo.userservice.controller;

import com.emp.demo.userservice.entity.User;
import com.emp.demo.userservice.service.UserService;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class UserController {

    private UserService us;
    public  UserController(UserService uu){
        this.us = uu;
    }
    @PostMapping("/create")
    public String create(@RequestBody User u1){
        String x = UUID.randomUUID().toString();
        u1.setId(x);
        us.createUser(u1);
        return "Sucess";
    }
    @GetMapping("/getAllUser")
    public List<User> getALlUser(){
        return us.getAllUser();
    }
    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable String id){
        User u1 = us.getOneUser(id);
        return u1;
    }
    @PutMapping("/upadteUser/{id}")
    public String upadteUser(@PathVariable String id, @RequestBody User u1){
        boolean x = us.updateUser(id,u1);
        if(x){
            return "Sucess";
        }
        return "Data not Found";
    }
   @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUSer(@PathVariable String id){
        return us.deleteUser(id);
   }

}
