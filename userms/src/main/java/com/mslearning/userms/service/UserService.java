package com.mslearning.userms.service;


import com.mslearning.userms.model.OrderTO;
import com.mslearning.userms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderMSClient orderMSClient;

    public OrderTO[] getAllOrders() {

        System.out.println("UserResource");
        OrderTO[] allOrders = orderMSClient.getAllOrders();
        System.out.println(allOrders.length);

        // Aggregator Pattern
        OrderTO[] combinedOrders = Stream.of(allOrders)
                .flatMap(Stream::of)
                .toArray(OrderTO[]::new);
        return combinedOrders;
    }
}
