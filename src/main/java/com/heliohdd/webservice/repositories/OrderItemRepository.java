package com.heliohdd.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heliohdd.webservice.entities.OrderItem;
import com.heliohdd.webservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
