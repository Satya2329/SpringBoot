package com.exampl.OneToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext ioc = SpringApplication.run(MainApplication.class, args);
        EmployeeRepo eRepo  = ioc.getBean(EmployeeRepo.class);
        DepartmentRepo dRepo = ioc.getBean(DepartmentRepo.class);

        Employee e1 = new Employee();
        Department d1 = new Department();


    }
}
