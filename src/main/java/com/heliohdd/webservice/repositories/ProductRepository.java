package com.heliohdd.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heliohdd.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
