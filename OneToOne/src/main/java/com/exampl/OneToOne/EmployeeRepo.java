package com.exampl.OneToOne;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

}
