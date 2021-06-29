package com.test.oops;

public class Encapsulation {
	private String name;
	private int roll;
	private int age;
	public String getname() 
	{
		return name;
	
	}
	public int getroll()
	{
		return roll;
	}
	public int getage()
	{
		return age;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setroll( int roll)
	{
		this.roll =roll;
	}
	public void setage(int age)
	{
		this.age =age;
	}
	public void display()
	{
		System.out.println("student rollno = " +roll+ " student name =  " +name+ " age = " +age);
	}
	

}
