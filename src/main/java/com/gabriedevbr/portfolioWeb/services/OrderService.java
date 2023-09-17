package com.gabriedevbr.portfolioWeb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriedevbr.portfolioWeb.entities.Order;
import com.gabriedevbr.portfolioWeb.repositories.OrderRepository;
import com.gabriedevbr.portfolioWeb.repositories.UserRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	
	public Order findById(Long id ) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	 

}
