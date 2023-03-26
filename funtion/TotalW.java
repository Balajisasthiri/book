package com.day1.funtion;

public class TotalW {
public String findTotal(int tamil,int english,int social,int science,int maths) {
	int a=tamil+english+social+science+maths;
	return "Total="+a;
}
public static void main(String[] args) {
	TotalW b=new TotalW();
	System.out.println(b.findTotal(10,10,10,10,10));
}
}
