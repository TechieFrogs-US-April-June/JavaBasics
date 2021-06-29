package com.oops;

public class Employee {
	String ename;
	int salary;
	String address;
	public Employee()
	{
		this("Devika"); //call the constructor with String parameter
	}
	Employee(String name)
	{
		this(name,1234); //call the constructor with String,int parameter
	}
	Employee(String name,int sal )
	{
		this(name,sal,"collierville");
	}
	Employee(String name,int sal,String add)
	{
		this.ename=name;
		this.salary=sal;
		this.address=add;
	}
	void disp()
	{
		System.out.println(ename + " " + salary + " " + address);
	}
	
	

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.disp();

	}

}
