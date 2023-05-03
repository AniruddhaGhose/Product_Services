package com.ps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.entity.Product;

@Repository("productDao")
public interface ProductDao extends JpaRepository<Product, Integer> {

}
