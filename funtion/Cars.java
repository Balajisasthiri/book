package com.day1.funtion;

public class Cars {
String brand;
int price;
String colour;
public String findMax(Cars a,Cars b,Cars c) {
	if (a.price>b.price && a.price>c.price) {
		return a.brand;
	}
	else if(b.price>a.price && b.price>c.price) {
		return b.brand;
	}
	else {
		return c.brand;
	}
}
}
		



