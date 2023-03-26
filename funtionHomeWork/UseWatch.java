package com.day1.funtionHomeWork;

public class UseWatch {
public static void main(String[] args) {
	Watch w1=new Watch();
	w1.brand="Quartz";
	w1.price=2000;
	
	Watch w2=new Watch();
	w2.brand="Tata";
	w2.price=3000;
	
	Watch w3=new Watch();
	w3.brand="Sonata";
	w3.price=4000;
	
	Watch w4=new Watch();
	w4.brand="Apple";
	w4.price=5000;
	
	Watch[] watches= {w2,w2,w3,w4};
	Watch max=w1.maxPrice(watches);
	System.out.println("Brand="+max.brand+", Price="+max.price);
}
}
