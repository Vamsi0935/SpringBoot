package com.codegnan.SpringDemo_02.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("101")
	int id;
	@Value("Vamsi Krishna Dudyala")
	String name;
	@Value("dvkrishna142000@gmail.com")
	String email;
	@Autowired
	Address resAddress;

	public Employee() {

	}

	public Employee(int id, String name, String email, Address resAddress) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.resAddress = resAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getResAddress() {
		return resAddress;
	}

	public void setResAddress(Address resAddress) {
		this.resAddress = resAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", resAddress=" + resAddress + "]";
	}
}
