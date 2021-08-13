package com.yuttachak.cakesystem15.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yuttachak.cakesystem15.entity.Product;
import com.yuttachak.cakesystem15.repository.ProductRepository;


@Service
public class ProductSeviceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductSeviceImpl(ProductRepository theProductRepository) {
		productRepository = theProductRepository;
	}
	
	// อ่านข้อมูลจาก Database ทั้งหมด
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	} 
	
	// แก้ไขข้อมูล
	@Override
	public Product findById(int TheId) {
		Optional<Product> result = productRepository.findById(TheId);
		Product theProduct = null;
		if(result.isPresent()) {
			result.get();
		}else {
			throw new RuntimeException("หาข้อมูลไม่เจอ"+ TheId);
		}
		return theProduct;
	}
	
	// บันทึก,เพิ่มข้อมูล
	@Override
	public void save(Product theProduct) {
		productRepository.save(theProduct);
	}
	
	// ลบข้อมูล
	@Override
	public void deleteById(int TheId) {
		productRepository.deleteById(TheId);
	}
	
}
