package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    
    //add employee
    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    //get all employees
    @GetMapping("employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //get employee by id
    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    //update employee by id
    @PutMapping("employee/{id}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable Long id){
        return employeeService.updateEmployee(employee,id);
    }

    //delete employee by id
    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }


}
