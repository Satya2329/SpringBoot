package com.exampl.OneToOne;

import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
