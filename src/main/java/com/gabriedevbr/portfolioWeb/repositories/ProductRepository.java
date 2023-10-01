package com.gabriedevbr.portfolioWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriedevbr.portfolioWeb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
