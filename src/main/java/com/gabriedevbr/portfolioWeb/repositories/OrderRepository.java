package com.gabriedevbr.portfolioWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriedevbr.portfolioWeb.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{
	
	

}
