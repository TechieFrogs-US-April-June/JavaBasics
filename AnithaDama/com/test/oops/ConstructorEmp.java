package com.test.oops;

public class ConstructorEmp {
	int idno;
	String name;
	int sal;
	ConstructorEmp(int eno,String ename)
	{
		idno=eno;
		name=ename;
		
	}
	ConstructorEmp(int eno,String ename,int esal)
	{
		idno=eno;
		name=ename;
		sal=esal;
	}
	void display()
	{
		System.out.println(idno + " " +name+" " + sal);
	}
	

	public static void main(String[] args) {
		ConstructorEmp emp1 =new ConstructorEmp(111,"aaaa");
		ConstructorEmp emp2 =new ConstructorEmp(123,"bbbb",6000);
		emp1.display();
		emp2.display();

	}

}
