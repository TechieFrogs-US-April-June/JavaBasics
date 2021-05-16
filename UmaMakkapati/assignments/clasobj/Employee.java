package com.clasobj;

public class Employee {
	
	String name;
	int yoj;
	int salary;
	String address;
	
	Employee(String name, int yoj, int salary, String address)
	{
		this.name = name;
		this.yoj = yoj;
		this.salary = salary;
		this.address = address;
		
	}
	
	static
	{
		System.out.println("Name"+"    "+"Year Of Joining"+"       "+"Address"+"          "+"Salary");
	}
	
	void information()
	{
		System.out.println(name+"      "+yoj+"            "+address+"    "+salary);
	}
	

	public static void main(String[] args) 
	{
		//Employee Eobj3 = new Employee();
		Employee Eobj = new Employee("Robert",1994,68978,"64C-WallsStreet");
		Employee Eobj1 = new Employee("Sam   ",2000,68078,"68D-WallsStreet");
		Employee Eobj2 = new Employee("John  ",1999,69978,"26B-WallsStreet");

		Eobj.information();
		Eobj2.information();
		Eobj1.information();
	}

}
/*
Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat

*/