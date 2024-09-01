package com.spring.Task1.repository;

import com.spring.Task1.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE YEAR(e.hiredate) = :year AND e.department = :department")
    List<Employee> yearAndDept(@Param("year") int year, @Param("department") String department);
}
