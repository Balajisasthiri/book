package com.day1.ForLoop;

public class FindFactorial {
	public static void main(String[] args) {
		int num=4;//Integer.parseInt(args[0]);
		int factorial=1;
		int t=0;
		for (int i=1;i<=num;i++) {
			t=t+factorial*i;
			factorial=factorial*i;
		}
		System.out.println(factorial);
		System.out.println(t);
	}

}
