package com.day1.ForLoop;

public class VowelsCount {
public static void main(String[] args) {
	String word="onesoft";
	int vow=0;
	int cons=0;
	for (int i=0;i<word.length();i++) {
		if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
		vow++;	
		}
		else {
			cons++;
		}
	}
	System.out.println("Cons="+cons++);
	System.out.println("vow="+vow++);
}
}
