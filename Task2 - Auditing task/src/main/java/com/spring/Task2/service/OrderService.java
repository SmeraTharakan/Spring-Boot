package com.spring.Task2.service;

import com.spring.Task2.entities.Orders;
import com.spring.Task2.repository.OrderRepository;
import com.spring.Task2.Model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public ResponseModel createOrder(Orders order){
        ResponseModel responseModel = new ResponseModel();
        orderRepository.save(order);
        responseModel.setMessage("Order Created");
        responseModel.setOrder(order);
        return responseModel;
    }
    public ResponseModel modifyOrder(Orders order){
        ResponseModel responseModel = new ResponseModel();
        orderRepository.save(order);
        responseModel.setMessage("Order Modified");
        responseModel.setOrder(order);
        return responseModel;
    }
    
}
