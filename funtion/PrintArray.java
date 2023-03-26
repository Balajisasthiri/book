package com.day1.funtion;

public class PrintArray {
public void printA(int[] a) {
	for(int i=0;i<a.length;i++) {
   System.out.println(a[i]);
	}
}
public static void main(String[] args) {
	PrintArray pa=new PrintArray();
	int[]age= {23,24,25,26};
   pa.printA(age);	
}
}
