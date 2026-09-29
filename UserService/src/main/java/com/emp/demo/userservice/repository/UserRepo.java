package com.emp.demo.userservice.repository;

import com.emp.demo.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
