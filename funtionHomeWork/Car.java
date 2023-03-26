package com.day1.funtionHomeWork;

public class Car {
	String brand;
	int price;
	int taxPercentage;
	int netPrice;

	public int findNetPrice(int price, int tax) {
		int t = price + (price * tax / 100);
		return t;

	}

}
