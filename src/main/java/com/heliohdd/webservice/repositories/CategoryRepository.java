package com.heliohdd.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heliohdd.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}