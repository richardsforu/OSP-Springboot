package com.cts.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> { 
	
	//public User findUserByUser(String userName);

}
