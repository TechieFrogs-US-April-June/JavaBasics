package com.clasobj;

public class Stu1and2 {
	String name;
	int rollnum;
	String phonenum;
	String address;

	public static void main(String[] args) 
	{
		Stu1and2 sam = new Stu1and2();
		Stu1and2 john = new Stu1and2();
		sam.name = "Sam";
		sam.rollnum = 3;
		sam.phonenum = "9015157676";
		sam.address = "India";
		john.name = "John";
		john.rollnum = 5;
		john.phonenum = "8087971879";
		john.address = "India";
		System.out.println(sam.name+" "+sam.rollnum+" "+sam.phonenum+" "+sam.address);
		System.out.println(john.name+" "+john.rollnum+" "+john.phonenum+" "+john.address);
		
	}

}
