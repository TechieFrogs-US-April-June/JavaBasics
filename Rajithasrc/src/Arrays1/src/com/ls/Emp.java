package com.ls;

public class Emp extends Policy1 {
	 
	static String cname;
	int eno;
	String ename;
	
	{
		System.out.println("am from instance block");
		eno=100;
		ename="A";
	}
	public Emp()
	{
		System.out.println("am from default constructor");
	}
	
	static
	{
		System.out.println("static block");
		cname="WellsFargo";
	}
	public void disp()
	{
		System.out.println(eno+"-"+ename);
	}
	

}
