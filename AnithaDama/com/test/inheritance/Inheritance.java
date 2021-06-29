/*8)Class B extends Class A. Class A has two member variables 'i' and 'j', a constructor and a method show() which displays the value of i and j.
Class B has a member variable 'k', a constructor.
 Write a method show() in class B which overrides the show() method of class A and displays the value of k.
---------------------------------------------------------------------------------------------------------------*/

package com.test.inheritance;
class A
{
	
	void show(int i,int j)
	{
		System.out.println(" i and j value: " +i + "  " +j);
	}
	
}
class B extends  A
{
	
	void show(int k)
	{
		System.out.println( " k value: " +k);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		A obj =new A() ;
		obj.show(1,2);
		B obj1= new B();
		obj1.show(3);
		

	}

}
