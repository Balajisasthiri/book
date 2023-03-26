package com.day1.funtion;

public class Square {
public int findSquare() {
	int a=9;
	int b=a*a;
	return b;
}
public static void main(String[] args) {
	Square a=new Square();
	System.out.println(a.findSquare());
}
}
