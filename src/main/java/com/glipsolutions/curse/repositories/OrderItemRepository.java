package com.glipsolutions.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glipsolutions.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
