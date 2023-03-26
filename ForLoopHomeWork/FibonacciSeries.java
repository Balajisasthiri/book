package com.day1.ForLoopHomeWork;

public class FibonacciSeries {
public static void main(String[] args) {
int x=0;
int y=1;
int z=0;
int t=0;
int c=0;
for (int i=0;i<=4;i++) {
	//System.out.println(x);
	x=y;
	y=z;
	z=x+y;
	t=t+z;
	c++;

System.out.println(z);
}
System.out.println(t+","+c);
}
}
