package com.test.string;

public class Book {
	String Bname;
	int price;
	Author author;//Has_A relationship
	public Book(String bname, int price, Author author) {
		
		Bname = bname;
		this.price = price;
		this.author = author;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
