package com.yuttachak.cakesystem15.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuttachak.cakesystem15.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
