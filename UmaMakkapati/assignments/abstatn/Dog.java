package com.abstatn;

public class Dog extends Animal
{

	@Override
	public void animalsound() 
	{
		System.out.println("Barks");
	}
	 public static void main(String args[])
	 {
		
		 Dog obj1 = new Dog();
		 obj1.animalsound();
		 // This would call the Dog class method

		 Animal obj11 = new Lion();
		 obj11.animalsound();
	 }
}