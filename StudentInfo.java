
/*Assign and print the roll number, phone number and address of two students having names
 *  "Sam" and "John" respectively  by creating two objects of class 'Student'.
 */
package com.test.oops;

public class StudentInfo {
	String name;
	int rollno;
	long phone_no;
	String address;

	public static void main(String[] args) {
		StudentInfo s1=new StudentInfo();
		StudentInfo s2 = new StudentInfo();
				
		s1.name="Sam";
		s1.rollno=101;
		s1.phone_no=1234567891;
		s1.address="856 collierville";
		s2.name="John";
		s2.rollno=102;
		s2.phone_no=13245623;
		s2.address="857 germantown";
		System.out.println(s1.name +" " +s1.rollno+" " +s1.phone_no +" " +s1.address);
		System.out.println(s2.name +" " +s2.rollno+ " " +s2.phone_no+ " " +s2.address);
		

	}

}
