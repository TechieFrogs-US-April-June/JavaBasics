package com.finalKeyword;

public class StudentData {
	final int StuRollNo;
	StudentData(int rollNo)
	{
		StuRollNo=rollNo;
	}
	void disp()
	{
		System.out.println(StuRollNo);
	}

	public static void main(String[] args) {
		StudentData s1 = new StudentData(1002);
		s1.disp();

	}

}
