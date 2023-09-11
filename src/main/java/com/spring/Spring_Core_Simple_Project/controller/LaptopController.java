package com.spring.Spring_Core_Simple_Project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_Core_Simple_Project.dao.Laptop;

public class LaptopController {

	public static void main(String[] args) 
	{
          ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
          
          Laptop laptop=(Laptop) applicationContext.getBean("mylaptop");
          
          System.out.println(laptop);
	}

}
