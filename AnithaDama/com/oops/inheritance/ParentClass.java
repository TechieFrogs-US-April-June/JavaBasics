package com.oops.inheritance;

public class ParentClass {
	ParentClass()
	{
		System.out.println("Parent class constructor");
	}

}
class ChildClass extends ParentClass
{
	ChildClass()
	{
		System.out.println("Child class constructor");
	}
	ChildClass(int num)
	{
		System.out.println("parameterized class constructor");
	}
	void disp()
	{
		System.out.println("Hello !");
	}
}
