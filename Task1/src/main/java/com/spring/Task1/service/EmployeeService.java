package com.spring.Task1.service;

import com.spring.Task1.entities.Employee;
import com.spring.Task1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired

    private EmployeeRepository employeeRepository;

    public List<Employee> getByYearAndDept(int year, String department) {
        return employeeRepository.yearAndDept(year, department);
    }

    
}
