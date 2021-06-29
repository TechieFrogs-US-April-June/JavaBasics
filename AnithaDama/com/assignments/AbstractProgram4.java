/*An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named 'a_method' and a non-abstract method which
prints "This is a normal method of abstract class". A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints
"This is abstract method". Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)*/



package com.assignments;
abstract class Abstract1
{
	Abstract1()
	{
		System.out.println("this is constructor of abstract class");
	}
	abstract void a_method();
	public void display()
	{
		System.out.println("this is a normal method of abstract class");
		
	}
}
class Subclass extends Abstract1
{
	public void a_method()
	{
		System.out.println("this is abstract method");
	}
}
		

public class AbstractProgram4 {

	public static void main(String[] args) {
Subclass sub = new Subclass();
sub.a_method();
sub.display();

	}

}
