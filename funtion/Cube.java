package com.day1.funtion;

public class Cube {
public void findCube() { //void without parameter
	int a=5;
	System.out.println(a*a*a);
}
public static void main(String[] args) {
	Cube c=new Cube();
	c.findCube();
}
}
