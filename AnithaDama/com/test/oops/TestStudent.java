package com.test.oops;

public class TestStudent {
	int r = 104;
	String n =" aaaa";
	static String branch1 ="electronic";
	void display()
	{
		Student st1 = new Student();
				st1.display();
	}

	public static void main(String[] args) {
		System.out.println(Student.branch);
		TestStudent ts = new TestStudent();
		
		System.out.println(ts.r +" " +ts.n);
		ts.display();
		ts.r = 105;
		ts.n = "ggggg";
		ts.display();
		System.out.println(ts.r + " " +ts.n);
		

	}

}
