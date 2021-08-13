package com.yuttachak.cakesystem15.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	//ขั้นตอนที่ 1 ส่วนนี้สร้าง Entity ติดต่อฐานข้อมูล MySQL
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="product_name") //มาจาก MySQL
	public String Product_Name; //ให้รู้สำหรับ Java
	
	@Column(name="product_description") //มาจาก MySQL
	public String Product_Description; //ให้รู้สำหรับ Java
	
	@Column(name="product_price") //มาจาก MySQL
	public double Product_Price; //ให้รู้สำหรับ Java
	
	@Column(name="product_image") //มาจาก MySQL
	public String Product_Image; //ให้รู้สำหรับ Java

	// default 
	public Product() {}
	
	// ขั้นตอนที่ 2 กำหนด Constructor กับ Field
	public Product(int id, String product_Name, String product_Description, double product_Price,
			String product_Image) {
		super();
		this.id = id;
		Product_Name = product_Name;
		Product_Description = product_Description;
		Product_Price = product_Price;
		Product_Image = product_Image;
	}

	// ขั้นตอนที่ 3 สร้าง Getter Setter ให้ Java 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getProduct_Description() {
		return Product_Description;
	}

	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}

	public double getProduct_Price() {
		return Product_Price;
	}

	public void setProduct_Price(double product_Price) {
		Product_Price = product_Price;
	}

	public String getProduct_Image() {
		return Product_Image;
	}

	public void setProduct_Image(String product_Image) {
		Product_Image = product_Image;
	}

	// ขั้นตอนที่ 4 Generated to String
	@Override
	public String toString() {
		return "Product [id=" + id + ", Product_Name=" + Product_Name + ", Product_Description=" + Product_Description
				+ ", Product_Price=" + Product_Price + ", Product_Image=" + Product_Image + "]";
	}
	
	
	
}
