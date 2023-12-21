package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.Order;

public interface OderRepository extends JpaRepository<Order, Long> {

}
