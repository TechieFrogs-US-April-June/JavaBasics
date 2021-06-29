package com.test.inheritance;
class Person
{
	protected String name;
	protected int age;
	

public void setpersondetails(String p_name,int p_age)
{
	name = p_name;
	age = p_age;
}
public void getpersondetails()
{
	System.out.println(" Name : " +name);
	System.out.println(" age :" +age);
	
}
}
class Student extends Person
{
	private int marks;

public void setstudentdetails(String s_name,int s_age,int s_marks)
{
	setpersondetails(s_name,s_age);
	marks = s_marks;
}
public void getstudentdetails()
{
	System.out.println(" Student details ");
	getpersondetails();
	System.out.println(" marks " +marks);
}
}
class Teacher extends Person
{
	private int salary;
	public void setteacherdetails(String t_name,int t_age,int t_salary)
	{
		setpersondetails(t_name,t_age);
		salary =t_salary;
	}
	public void gerteacherdetails()
	{
		System.out.println("teacher details");
		getpersondetails();
		System.out.println(" salary " +salary);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setstudentdetails("jhon", 20, 80);
		st.getstudentdetails();
		Teacher t1= new Teacher();
		t1.setteacherdetails("devika", 30, 6000);
		t1.gerteacherdetails();
				
		

	}

}
