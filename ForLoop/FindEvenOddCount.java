package com.day1.ForLoop;

public class FindEvenOddCount {
public static void main(String[] args) {
	int e=0;
	int o=0;
	int sum=0;
	for (int i=0;i<=5;i++) {
		if (i%2==0) {
	    e++;
		}
		else {
		o++;
		}
		sum=sum+i;
	}
		System.out.println("Evencount="+e);
		System.out.println("Odd count="+o);
		System.out.println(sum);
	}
}

