package com.abc;

class Teacher18 {
	   String designation = "Teacher";
	   String college = "Beginnersbook";
	   void does(){
		System.out.println("Teaching");
	   }
	}
	public class MathTeacherInheritance extends Teacher18{
	   String mainSubject = "Maths";
	   public static void main(String args[]){
	      MathTeacherInheritance obj = new MathTeacherInheritance();
	      System.out.println(obj.college);
	      System.out.println(obj.designation);
	      System.out.println(obj.mainSubject);
	      obj.does();
	   }
	}