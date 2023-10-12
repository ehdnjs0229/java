package com.kh.example.practice6.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		System.out.println(title+" "+publisher+" "+author+" "+price+" "+discountRate);
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		System.out.println(this.title+" "+this.publisher+" "+this.author);
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
		System.out.println(this.title+" "+this.publisher+" "+this.author+" "+this.price+" "+this.discountRate);
	}
	
	public void inform() {
		System.out.println(title+" "+publisher+" "+author+" "+price+" "+discountRate);
	}

}
