package com.karina.InheritanceTablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="car")

public class Car extends Vehicles
{

	int cid;
	String carname;
	String price;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
