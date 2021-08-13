package com.yuttachak.cakesystem15.service;

import java.util.List;

import com.yuttachak.cakesystem15.entity.Product;

public interface ProductService {
	
	// อ่านข้อมูลจาก Database ทั้งหมด
	public List<Product> findAll(); 
	
	// แก้ไขข้อมูล
	public Product findById(int TheId);
	
	// บันทึก,เพิ่มข้อมูล
	public void save(Product theProduct);
	
	// ลบข้อมูล
	public void deleteById(int TheId);
	
}
