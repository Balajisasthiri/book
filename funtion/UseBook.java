package com.day1.funtion;

public class UseBook {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.name="History";
		b1.authorName="Keshav";
		b1.price=200;
		
		Book b2=new Book();
		b2.name="Science";
		b2.authorName="Raja";
		b2.price=400;
		
		Book b3=new Book();
		b3.name="Biology";
		b3.authorName="Kmlkjh";
		b3.price=600;
		
		Book[] books= {b1,b2,b3};
		b2.findVowel(books);
		
	}
}
