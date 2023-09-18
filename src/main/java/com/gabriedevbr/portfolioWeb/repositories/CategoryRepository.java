package com.gabriedevbr.portfolioWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriedevbr.portfolioWeb.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	
	

}
