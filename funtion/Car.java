package com.day1.funtion;

public class Car { //bean class   return with parameter
String brand;
int price;
String colour;

public String findMaxPrice(Car a,Car b) {
	if(a.price>b.price) {
		
	return a.brand;
	}
	else {
		return b.brand;
	}
	}
}
