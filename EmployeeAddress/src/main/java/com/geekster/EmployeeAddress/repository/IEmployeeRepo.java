package com.geekster.EmployeeAddress.repository;

import com.geekster.EmployeeAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
