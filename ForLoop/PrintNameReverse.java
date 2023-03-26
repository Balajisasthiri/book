package com.day1.ForLoop;

public class PrintNameReverse {
	public static void main(String[] args) {
		String word=args[0];//"Dog";
		String temp="";
		for (int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
		
		System.out.println(temp);
		}
	}

}
