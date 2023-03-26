package com.day1.funtionHomeWork;

public class Watch {
	String brand;
	int price;
	int discountAmount;
	boolean isSensor;
	
	public Watch maxPrice(Watch[] watches) {
		int max=watches[0].price;
		Watch a=null;
		for(Watch x:watches) {
			if(x.price>max) {
				max=x.price;
				a=x;
			}
		}
		return a; 
	}

}
