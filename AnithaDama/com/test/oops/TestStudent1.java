/*1.
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/



package com.test.oops;
class Student2{
	String name;
	int rollno;
	
}
public class TestStudent1 {

	public static void main(String[] args) {
		Student2 st1 = new Student2();
		
		st1.name="Sam";
		st1.rollno=2;
		System.out.println(st1.name + " " +st1.rollno);

	}

}
