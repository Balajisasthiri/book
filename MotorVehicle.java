package com.day1;

public class MotorVehicle {
	public static void main(String[] args) {
		String brand="BMW";
		int price=800000;
		String colour="red,blue,black";
		boolean isSensor=true;
		int taxAmount=5000;
		int netPrice=price+taxAmount;
		System.out.println("NetPrice:"+netPrice+", "+"Brand:"+brand+", "+"Colour:"+colour+", Is Sensor:"+isSensor);
	}

}
