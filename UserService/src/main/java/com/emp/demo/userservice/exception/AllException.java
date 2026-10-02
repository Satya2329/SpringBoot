<<<<<<< HEAD
package com.emp.demo.userservice.exception;

import com.emp.demo.userservice.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.ResponseEntity.*;

@RestControllerAdvice
public class AllException {

    @ExceptionHandler(UserNotFoundExcpetion.class)
    public ResponseEntity<ApiResponse> handleUserNotFoundException(UserNotFoundExcpetion e){
        String msg=e.getMessage();
        ApiResponse response=ApiResponse.builder().message(msg).status(HttpStatus.NOT_FOUND).build();
    return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
=======
package com.emp.demo.userservice.exception;

import com.emp.demo.userservice.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.ResponseEntity.*;

@RestControllerAdvice
public class AllException {

    @ExceptionHandler(UserNotFoundExcpetion.class)
    public ResponseEntity<ApiResponse> handleUserNotFoundException(UserNotFoundExcpetion e){
        String msg=e.getMessage();
        ApiResponse response=ApiResponse.builder().message(msg).status(HttpStatus.NOT_FOUND).build();
    return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
>>>>>>> 55da827e08f63666ea875620ecbafcf664e5043b
