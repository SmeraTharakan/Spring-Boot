package com.spring.Task1.controller;

import com.spring.Task1.entities.Employee;
import com.spring.Task1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(@RequestParam int year, @RequestParam String department) {
        return employeeService.getByYearAndDept(year, department);
    }
}
