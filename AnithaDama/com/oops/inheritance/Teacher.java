package com.oops.inheritance;

public class Teacher {
	String Designation="Teacher";
	String collegeName="Hitech";
	public void does()
	{
		System.out.println("teaching");
	}
}
 class MathTeacher extends Teacher
{
	String Subject = "Math";
}