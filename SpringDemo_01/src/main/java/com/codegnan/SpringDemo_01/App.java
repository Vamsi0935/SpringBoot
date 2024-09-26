package com.codegnan.SpringDemo_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegnan.SpringDemo_01.beans.Person;

public class App {
	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		Person person = (Person) ctxt.getBean("person");
		System.out.println(person);
	}
}