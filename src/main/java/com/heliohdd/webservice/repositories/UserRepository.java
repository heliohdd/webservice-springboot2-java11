package com.heliohdd.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heliohdd.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}