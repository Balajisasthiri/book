package com.day1.funtion;

public class VoidWithParameter {
public void findName(String name,int age) {
	System.out.println(name+" "+age);
}
public static void main(String[] args) {
	VoidWithParameter c=new VoidWithParameter();
	c.findName("viji",28);
	c.findName("surya",29);
}
}
