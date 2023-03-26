package com.day1.funtionHomeWork;

public class StringRevMin {
	public static void main(String[] args) {
		String[] name = { "Nishanti", "viji", "Bushra", "Ashika", "Manimaran", "Prakash" };
		StringRevMin a = new StringRevMin();
		String min = a.findMin(name);
		String rev = a.revString(min);
		System.out.println(rev);
	}

	public String findMin(String[] b) {
		int min = b[0].length();
		String rep= "";
		for (int i = 0; i < b.length; i++) {
			if (min > b[i].length()) {
				rep = b[i];
				min = b[i].length();
			}
		}
		return rep;
	}

	public String revString(String a) {
		char[] c = a.toCharArray();
		String revs= "";
		for (int i = c.length - 1; i >= 0; i--) {
			revs = revs + c[i];
		}
		return revs;
	}

}
