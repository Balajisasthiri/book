package com.day1.funtion;

public class GreaterWithParameter {
public boolean findGreater(int a,int b) { //return with parameter
	return a>b;
}
public static void main(String[] args) {
	GreaterWithParameter a=new GreaterWithParameter();
	System.out.println(a.findGreater(25, 20));
	System.out.println(a.findGreater(20, 25));
}
}
