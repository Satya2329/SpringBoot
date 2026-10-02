package com.example.OneToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext ioc = SpringApplication.run(MainApplication.class, args);
        EmployeeRepo Erp = ioc.getBean(EmployeeRepo.class);

    }
}
