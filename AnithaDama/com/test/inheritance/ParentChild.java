/*1.
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
________________________________________
2.
In the above example, declare the method of the parent class as private and then repeat the first two operations (You will get error in the third).
________________________________________*/

package com.test.inheritance;
class Parent
{
	public void print1()
	//private void print1()
	{
		System.out.println(" This is parent class ");
		}
}
class Child extends Parent
{
	public void print2()
	{
		System.out.println("This is child class");
	}
}

public class ParentChild {

	public static void main(String[] args) {
		Child ch = new Child();
		Parent p = new Parent();
		p.print1();
		ch.print2();
		ch.print1();

	}

}
