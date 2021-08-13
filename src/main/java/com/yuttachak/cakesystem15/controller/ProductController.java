package com.yuttachak.cakesystem15.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuttachak.cakesystem15.entity.Product;
import com.yuttachak.cakesystem15.service.ProductService;

@Service
@Controller
@RequestMapping("/")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService theProductService){
		productService = theProductService;
	}

	@GetMapping("/")
	public String ListAll(Model theModel) {
		List<Product> theProduct = productService.findAll();
		theModel.addAttribute("products", theProduct);
		return "list-product";
	}
	
}
