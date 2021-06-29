package com.inhertnce;

public class MathTeacher extends Teacher
	{
	   String mainSubject = "Maths";
	   public static void main(String args[]){
	      MathTeacher obj = new MathTeacher();
	      System.out.println(obj.college);
	      System.out.println(obj.designation);
	      System.out.println(obj.mainSubject);
	      obj.does();
	   }
	}
