/*Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark",
both inheriting the class */

package com.test.Abstract;
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals
{
	public void cats()
	{
		System.out.println("cats meow");
	}
	public void dogs()
	{
		
	}
}
class Dogs extends Animals
{
	public void dogs()
	{
		System.out.println("dogs bark");
	}
	public void cats()
	{
		
	}
}

public class AbstractProgram5 {

	public static void main(String[] args) {
		Cats c = new Cats();
		Dogs d = new Dogs();
		c.cats();
		d.dogs();
		
		

	}

}
