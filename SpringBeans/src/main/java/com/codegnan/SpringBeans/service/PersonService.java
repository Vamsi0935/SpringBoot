package com.codegnan.SpringBeans.service;

import com.codegnan.SpringBeans.beans.Person;

public interface PersonService {

	void save(Person person);

	Person find(int id);

}
