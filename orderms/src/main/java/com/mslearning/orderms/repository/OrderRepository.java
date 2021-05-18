package com.mslearning.orderms.repository;

import com.mslearning.orderms.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
