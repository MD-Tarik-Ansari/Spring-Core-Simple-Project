package com.spring.Spring_Core_Simple_Project.dao;

public class Product 
{
   private int id;
   private String name;
   private double price;
public Product(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}
}
