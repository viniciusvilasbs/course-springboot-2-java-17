package com.educandowebvinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebvinicius.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
