package com.abc;

class Animal17{
	   public void animalSound(){
		System.out.println("Default Sound");
	   }
	}
	public class DogDynamicPolymorphism extends Animal17{

	   public void animalSound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal17 obj = new DogDynamicPolymorphism();
		obj.animalSound();
	   }
	}
