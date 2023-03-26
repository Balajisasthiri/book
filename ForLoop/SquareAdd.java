package com.day1.ForLoop;

public class SquareAdd {
public static void main(String[] args) {
	int sum=0;
	int temp=0;
	for(int i=1;i<=5;i++) {
		sum=sum+i*i;
		temp=temp+sum;
	}
	System.out.println(sum);
}
}
