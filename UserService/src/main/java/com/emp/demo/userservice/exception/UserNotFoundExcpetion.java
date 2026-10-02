package com.emp.demo.userservice.exception;

public class UserNotFoundExcpetion extends  RuntimeException{
    public UserNotFoundExcpetion(String message) {
        super(message);
    }
    public UserNotFoundExcpetion() {
        super("User Not Found");
    }
}
