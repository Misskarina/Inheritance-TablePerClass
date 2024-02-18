package com.karina.InheritanceTablePerClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController
{

	@Autowired
	VehiclesRepository vrepo;
	@RequestMapping("/test")
	public String test()
	{
		return"program tested";
	}
	@RequestMapping("/save")
	public String save()
	{
		Vehicles v=new Vehicles();
		v.setName("Jay Singh");
		
		Bike b=new Bike();
		b.setBikeid(101);
		//b.setName("Raj Singh");
		b.setBname("MT15");
		b.setPrice("90k");
		
		Car c=new Car();
		c.setCid(1111);
		//c.setName("Abhishek Singh");
		c.setCarname("AUDI");
		c.setPrice("1000k");
		
		vrepo.save(v);
		vrepo.save(c);
		vrepo.save(b);
		
		return"data saved";
		
	}
}
