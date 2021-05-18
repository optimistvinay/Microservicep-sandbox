package com.mslearning.userms.service;

import com.mslearning.userms.model.OrderTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class OrderMSClient {

    @Autowired
    private RestTemplate restTemplate;


    public OrderTO[] getAllOrders() {
        log.info("****************");
        log.info("Getting all orders from Orderms");
        OrderTO[] forObject = restTemplate.getForObject("http://orderms/orders", OrderTO[].class);

        return forObject;
    }
}
