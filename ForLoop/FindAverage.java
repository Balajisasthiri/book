package com.day1.ForLoop;

public class FindAverage {
	public static void main(String[] args) {
		int count=0;
	    int total=0;
		for (int i=0;i<=1000;i++) {
		count++;
		total=total+i;
		}
		System.out.println(total/count);
		System.out.println(total);
		System.out.println(count);
		
	}

}
