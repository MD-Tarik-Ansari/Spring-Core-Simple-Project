package com.spring.Spring_Core_Simple_Project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_Core_Simple_Project.dao.Product;

public class ProductController 
{
   public static void main(String[] args) 
   {
	    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
	    
	    Product product=(Product) applicationContext.getBean("myproduct");
	    
	    System.out.println(product);
   }
}
