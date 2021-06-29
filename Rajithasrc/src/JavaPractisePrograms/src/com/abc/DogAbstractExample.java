package com.abc;

abstract class Animal{
	   //abstract method
	   public abstract void animalSound();
	}
	public class DogAbstractExample extends Animal{

	   public void animalSound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal obj = new DogAbstractExample();
		obj.animalSound();
	   }
	}