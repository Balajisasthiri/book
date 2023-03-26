package com.day1.funtion;

public class UseCar {
public static void main(String[] args) {
	Car c1=new Car();
	c1.brand="BMW";
	c1.price=5000000;
	c1.colour="red";
	Car c2=new Car();
	c2.brand="VW";
	c2.price=6000000;
	c2.colour="Black";
	
	
	
	System.out.println(c2.findMaxPrice(c1,c2));
}
}
