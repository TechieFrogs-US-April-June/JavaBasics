package com.oops.inheritance;

public class InheritanceEx1 {

	public static void main(String[] args) {
		MathTeacher obj1 = new MathTeacher();
		System.out.println(obj1.Designation);
		System.out.println(obj1.collegeName);
		System.out.println(obj1.Subject);
		obj1.does();
		MusicTeacher obj2 = new MusicTeacher();
		System.out.println(obj2.getDesignation());           /* we are not accessing the data members directly
		System.out.println(obj2.getCollegeName());              we are using public getter methods to accessing private data members of parent class*/
		System.out.println(obj2.Subject);                      
		obj2.does();

	}

}
