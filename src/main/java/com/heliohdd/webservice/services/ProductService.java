package com.heliohdd.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliohdd.webservice.entities.Product;
import com.heliohdd.webservice.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
//		List<Product> list = productRepository.findAll();
//		return list ;
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> prod = productRepository.findById(id); 
		return prod.get();
	}

}
