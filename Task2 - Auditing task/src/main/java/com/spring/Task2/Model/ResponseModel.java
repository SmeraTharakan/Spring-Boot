package com.spring.Task2.Model;


import com.spring.Task2.entities.Orders;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ResponseModel {
    private String message;
    private Orders order;
}
