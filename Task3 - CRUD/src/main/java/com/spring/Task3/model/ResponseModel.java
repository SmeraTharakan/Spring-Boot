package com.spring.Task3.model;

import com.spring.Task3.entities.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ResponseModel {
    private String message;
    private Student student;
}
