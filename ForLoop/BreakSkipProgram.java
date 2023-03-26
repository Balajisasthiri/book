package com.day1.ForLoop;

public class BreakSkipProgram {
	public static void main(String[] args) {
	for (int i=1;i<=10;i++) {
		if (i%3==0) {
			//break;
			continue;
		}
		else {
	
			System.out.println(i);
		}
	}
		
	}

}
