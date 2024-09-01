package com.spring.Task3.controller;

import com.spring.Task3.entities.Student;
import com.spring.Task3.model.ResponseModel;
import com.spring.Task3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentByID(@PathVariable long id) {
        return studentService.getStudentByID(id);
    }

    @PostMapping("/create")
    public ResponseModel createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PatchMapping("/update")
    public ResponseModel updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseModel deleteStudent(@PathVariable long id) {
        return studentService.deleteStudent(id);
    }
}
