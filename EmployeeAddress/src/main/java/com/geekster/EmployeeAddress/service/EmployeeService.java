package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "new employee added successfully!!";
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).get();
    }

    public String updateEmployee(Employee employee, Long id) {
        employeeRepo.existsById(id);
        employeeRepo.save(employee);
        return "employee updated for "+ id +" successfully!!";
    }

    public String deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "employee deleted for "+ id +" successfully!!";
    }
}
