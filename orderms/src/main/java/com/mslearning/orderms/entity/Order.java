package com.mslearning.orderms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_data")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String name;
}
