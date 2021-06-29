package com.inhertnce;

public class JavaExample extends Teacher1
	{
	   String mainSubject = "Physics";
	   public static void main(String args[])
	   {
		JavaExample obj = new JavaExample();
		/* Note: we are not accessing the data members 
		 * directly we are using public getter method 
		 * to access the private members of parent class
		 */
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
	   }
	}