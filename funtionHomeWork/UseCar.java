package com.day1.funtionHomeWork;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="Toyata";
		c1.price=100000;
		c1.taxPercentage=10;
		
		Car c2=new Car();
		c2.brand="Nissan";
		c2.price=200000;
		c2.taxPercentage=15;
		
		Car[] cars= {c1,c2};
		for(Car x:cars) {
			x.netPrice=c1.findNetPrice(x.price,x.taxPercentage);
			System.out.println("Brand="+x.brand+",NetPrice="+x.netPrice);
		}
	}

}
