package com.day1.funtion;

public class ArrayNum {
		public void printA(int[] a) {
			for(int i=0;i<a.length;i++) {
		   System.out.println(a[i]);
			}
		}
		public static void main(String[] args) {
			PrintArray pa=new PrintArray();
			int[]age= {1,10};
		   pa.printA(age);	
		}
		}


