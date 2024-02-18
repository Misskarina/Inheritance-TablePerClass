package com.karina.InheritanceTablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="bike")

public class Bike extends Vehicles
{

	int bikeid;
	String bname;
	String price;
	
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
