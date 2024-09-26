package com.codegnan.SpringDemo_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegnan.SpringDemo_02.beans.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = ctxt.getBean(Employee.class);
		System.out.println(employee);
	}
}
