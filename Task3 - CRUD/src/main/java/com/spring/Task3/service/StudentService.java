package com.spring.Task3.service;

import com.spring.Task3.entities.Student;
import com.spring.Task3.repository.StudentRepository;
import com.spring.Task3.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    public Student getStudentByID(long id) {
        Optional<Student> opt =studentRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
        
    }
    public ResponseModel createStudent(Student student){
        ResponseModel responseModel = new ResponseModel();
        studentRepository.save(student);
        responseModel.setMessage("Student added");
        responseModel.setStudent(student);
        return responseModel;
    }
    public ResponseModel updateStudent(Student student){
        ResponseModel responseModel = new ResponseModel();
        studentRepository.save(student);
        responseModel.setMessage("Student updated");
        responseModel.setStudent(student);
        return responseModel;
    }
    public ResponseModel deleteStudent(long id) {
        ResponseModel responseModel = new ResponseModel();
        Optional<Student> opt = studentRepository.findById(id);
        if (opt.isPresent()) {
            studentRepository.deleteById(id);
            responseModel.setMessage("Student deleted");
            responseModel.setStudent(opt.get());
        } else {
            responseModel.setMessage("Student not found");
            responseModel.setStudent(null);
        }
        return responseModel;
    }
}
