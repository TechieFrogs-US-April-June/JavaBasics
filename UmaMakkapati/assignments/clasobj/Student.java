package com.clasobj;

public class Student {
	String name ;
	int rollno ;
	

	public static void main(String[] args) {
		Student stuObj = new Student();
		stuObj.name = "John";
		stuObj.rollno = 2;
		System.out.println(stuObj.name+" "+stuObj.rollno);
		
		
	}

}
