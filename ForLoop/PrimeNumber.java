package com.day1.ForLoop;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=6;
		boolean a=true;
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				a=false;
			}
		}
		if (a==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
	}

}
