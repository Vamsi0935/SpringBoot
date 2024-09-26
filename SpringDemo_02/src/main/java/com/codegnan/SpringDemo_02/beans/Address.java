package com.codegnan.SpringDemo_02.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("503")
	int flatNo;
	@Value("Bachupally")
	String area;
	@Value("Hyderabad")
	String city;
	
	public Address() {
		
	}

	public Address(int flatNo, String area, String city) {
		super();
		this.flatNo = flatNo;
		this.area = area;
		this.city = city;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", area=" + area + ", city=" + city + "]";
	}
}
