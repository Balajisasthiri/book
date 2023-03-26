package com.day1.ForLoop;

public class PrintCharacterReverse {
	public static void main(String[] args) {
		String word="Balaji";
		String t="";
		for (int i=word.length()-1;i>=0;i--) {
			t=t+word.charAt(i);
			System.out.println(word.charAt(i));
		}
		System.out.println(t);
	}

}
