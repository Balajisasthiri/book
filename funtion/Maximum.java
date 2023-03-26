package com.day1.funtion;

public class Maximum {
	//public int max(int[]a) {
	public void max(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
     if (a[i]>=max) {
     max=a[i];

   }
      }
	System.out.println(max);	//return max;
}
	public static void main(String[] args) {
		Maximum a=new Maximum();
		int[] values= {10,20,70,30,40,50};
	a.max(values);	//System.out.println(a.max(values));
	}
}