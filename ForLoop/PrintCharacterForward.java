package com.day1.ForLoop;

public class PrintCharacterForward {
	public static void main(String[] args) {
		String word=args[0];//"Cat";
		String temp="";
		for (int i=0;i<word.length();i++) {
			temp=temp+word.charAt(i);
			System.out.println(word.charAt(i));
		}
		System.out.println(temp);
	}

}
