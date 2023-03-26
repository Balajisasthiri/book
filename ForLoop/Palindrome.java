package com.day1.ForLoop;

public class Palindrome {
public static void main(String[] args) {
	String word="Mom";
	String temp="";
	for (int i=word.length()-1;i>=0;i--) {
		temp=temp+word.charAt(i);
	}
	if (word.equalsIgnoreCase(temp)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
