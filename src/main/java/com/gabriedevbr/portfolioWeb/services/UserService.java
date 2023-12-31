package com.gabriedevbr.portfolioWeb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriedevbr.portfolioWeb.entities.Category;
import com.gabriedevbr.portfolioWeb.entities.User;
import com.gabriedevbr.portfolioWeb.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	
	public User findById(Long id ) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	 

}
