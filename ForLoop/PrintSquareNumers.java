package com.day1.ForLoop;

public class PrintSquareNumers {
	public static void main(String[] args) {
		int total=0;
		int total1=0;
		for (int i=1;i<=10;i++) {
			total=total+(i*i);
			System.out.println(i*i);
			
			//total=total+i;
			total1=total1+total;
		}
	System.out.println(total);
	}

}
