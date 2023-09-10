package com.gabriedevbr.portfolioWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriedevbr.portfolioWeb.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	

}
