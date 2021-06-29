
/*Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static method with the same name to print "Child". 
Now call this method by the objects of the two classes. Also, call this method by an object of the parent class refering to the child class
i.e. A obj = new B()
________________________________________*/

package com.test.methods;
class A
{
	public static void print()
	{
		System.out.println("parent");
	}
}
class B extends A
{
	public static void print()
	{
		System.out.println("child");
	}
}
public class MethodProgram8 {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		a1.print();
		b1.print();
		A obj = new B();
		obj.print();

	}

}
