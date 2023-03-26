package com.day1.funtion;

public class AverageW {
public void findAverage(int t,int e,int ss,int m,int s) {  //void with parameter
	int tot=t+e+ss+m+s;
	System.out.println(tot/5);	
}
public static void main(String[] args) {
	AverageW a=new AverageW();
	a.findAverage(45, 55, 65, 75, 85);
}
}
