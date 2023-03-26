package com.day1.funtion;
public class GreaterAge {
public void findG() {   //void without parameter
	int a=18;
	int b=20;
	int c=25;
	if (a>b && a>c) {
		System.out.println("Age a is max");
	}
	else if (b>a && b>c) {
		System.out.println("Age b is max");
	}
	else if(c>a && c>b) {
		System.out.println("Age c is max");
	}
	else {
		System.out.println("Invalid");
	}
}
public static void main(String[] args) {
	GreaterAge a=new GreaterAge();
	a.findG();
}
}
