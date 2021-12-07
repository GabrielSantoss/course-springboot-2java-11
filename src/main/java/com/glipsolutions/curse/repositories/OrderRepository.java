package com.glipsolutions.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glipsolutions.curse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
