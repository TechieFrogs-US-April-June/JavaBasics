/*Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' 
each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
Call the method by creating an object of each of the three classes.
________________________________________*/

package com.test.methods;
class Degree
{
	public void getDegree()
	{
		System.out.println("I got a degree");
	}
}
class Undergraduate extends Degree
{
	public void getDegree()
	{
		System.out.println("Iam a Undergraduate");
	}
}
class Postgraduate extends Degree
{
	public void getDegree()
	{
		System.out.println(" Iam postgraduate ");
	}
}
public class Methodprogram5 {

	public static void main(String[] args) {
		Degree obj1=new Degree();
		Undergraduate obj2=new Undergraduate();
		Postgraduate obj3 = new Postgraduate();
		obj1.getDegree();
		obj2.getDegree();
		obj3.getDegree();
				

	}

}
