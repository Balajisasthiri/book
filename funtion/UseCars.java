package com.day1.funtion;

public class UseCars {
	public static void main(String[] args) {
		Cars c1=new Cars();
		c1.brand="BMW";
		c1.price=5000000;
		c1.colour="red";
		Cars c2=new Cars();
		c2.brand="VW";
		c2.price=6000000;
		c2.colour="Black";
		Cars c3=new Cars();
		c3.brand="Audi";
		c3.price=7000000;
		c3.colour="Black";
System.out.println(c1.findMax(c1,c2,c3));
}
}
