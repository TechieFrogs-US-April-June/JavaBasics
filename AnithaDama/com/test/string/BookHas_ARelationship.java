package com.test.string;

public class BookHas_ARelationship {

	public static void main(String[] args) {
		Author a1 = new Author("abcd",50);
		Book b = new Book("disney",55,a1);
		System.out.println(b.getBname() +" " + b.getPrice());
		System.out.println(b.getAuthor().getAge() +" " + b.getAuthor().getAuthorName() );
		

	}

}
