package com.oops.inheritance;

public class SuperClass {
	int num =100;
	
	

}
class SubClass extends SuperClass

{
	int num = 120;

void printnum()
{
	System.out.println(super.num);
}
}