package com.spring.Task2.controller;

import com.spring.Task2.entities.Orders;
import com.spring.Task2.Model.ResponseModel;
import com.spring.Task2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/findAllOrders")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping("/create")
    public ResponseModel createOrder(@RequestBody Orders order) {
        return orderService.createOrder(order);
    }

    @PatchMapping("/update")
    public ResponseModel modifyOrder(@RequestBody Orders order){
        return orderService.modifyOrder(order);
    }
}
