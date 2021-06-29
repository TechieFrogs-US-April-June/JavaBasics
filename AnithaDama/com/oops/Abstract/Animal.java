package com.oops.Abstract;

 abstract class  Animal {
	 public abstract void Sound();// abstract method
}
 class Dog extends Animal
{
	public void Sound()
	{
		System.out.println("whoof");
	}
}