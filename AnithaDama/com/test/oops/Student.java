package com.test.oops;

public class Student {
	int rollno = 101;
	String name = "devika";
	 	static String branch = "computer";
	 	//String address;
	 	//long phone_no;
/*	void insertRecard(int r,String n )
	{
		rollno = r;
		name = n;
		
	}*/
	void display()
	{
		System.out.println(rollno + " " + name + " " + branch);
	}
	

	public static void main(String[] args) {
		System.out.println(TestStudent.branch1); 
		Student s1= new Student();
		//s1.insertRecard(101,"devika");
		s1.display();
		s1.rollno = 102;
		s1.name = "bbbb";
		s1.display();
		Student s2 = new Student();
		s2.rollno = 103;
		s2.name = "ccccc";
		s2.display();
		
		
		
	}
		
		
		
		

	}


