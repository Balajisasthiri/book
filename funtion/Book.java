package com.day1.funtion;

public class Book {
	String name;
	String authorName;
	int price;
	
	public void findVowel(Book[] a) {
		for(Book x:a) {
			if(x.authorName.contains("a")||x.authorName.contains("e")||x.authorName.contains("i")||x.authorName.contains("o")||x.authorName.contains("u")) {
       System.out.println(x.authorName);				
			}
			
		}
		
	}

}
