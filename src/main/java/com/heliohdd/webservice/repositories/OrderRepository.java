package com.heliohdd.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heliohdd.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}