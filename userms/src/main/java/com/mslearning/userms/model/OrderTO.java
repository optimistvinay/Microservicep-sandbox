package com.mslearning.userms.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderTO{
        private Long orderId;
        private String name;
}
