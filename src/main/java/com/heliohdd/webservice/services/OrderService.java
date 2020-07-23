package com.heliohdd.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliohdd.webservice.entities.Order;
import com.heliohdd.webservice.repositories.OrderRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = orderRepository.findById(id);
		return user.get();
		
	}
}