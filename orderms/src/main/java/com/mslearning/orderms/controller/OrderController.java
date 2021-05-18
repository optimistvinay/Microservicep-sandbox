package com.mslearning.orderms.controller;


import com.mslearning.orderms.entity.Order;
import com.mslearning.orderms.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<Order> getOrders(){
        log.info("/orders call");
        return orderRepository.findAll();
    }


    @GetMapping("/getSingleOrder/{orderId}")
    public Optional<Order> getSingleOrder(@PathVariable Long orderId){
        return orderRepository.findById(orderId);
    }
}
