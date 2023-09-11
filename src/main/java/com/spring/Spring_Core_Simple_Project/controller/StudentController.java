package com.spring.Spring_Core_Simple_Project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Spring_Core_Simple_Project.dao.Student;

public class StudentController {

	public static void main(String[] args) {
	      
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		
		Student student=(Student) applicationContext.getBean("mystudent");
		
		student.displayName();
	}
}
