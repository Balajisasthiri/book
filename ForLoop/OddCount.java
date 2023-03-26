package com.day1.ForLoop;

public class OddCount {
public static void main(String[] args) {
	int num=3;//Integer.parseInt(args[0]);
	int sum=0;
	for(int i=1;i<=num;i++) {
		if(i%2!=0) {
		sum=sum+1;
		}
	}
	System.out.println(sum);
}
}
