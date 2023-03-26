package com.day1.ForLoopHomeWork;

public class PrintNameReverse {
	public static void main(String[] args) {
		String name = "Balaji";
		String temp = "";
		for (int i=name.length()-1; i >= 0; i--) {
			temp = temp +name.charAt(i);
		}
		System.out.println(temp);
	}
}
