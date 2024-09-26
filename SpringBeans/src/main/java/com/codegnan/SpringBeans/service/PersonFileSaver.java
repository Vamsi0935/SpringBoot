package com.codegnan.SpringBeans.service;

import org.apache.log4j.Logger;

import com.codegnan.SpringBeans.beans.Person;

public class PersonFileSaver implements PersonService {
	
	Logger log = Logger.getLogger(PersonFileSaver.class);

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
