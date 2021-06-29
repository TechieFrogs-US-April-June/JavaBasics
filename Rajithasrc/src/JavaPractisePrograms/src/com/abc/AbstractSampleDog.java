package com.abc;
//abstract parent class
abstract class Animal22{
 //abstract method
 public abstract void sound();
}
//Dog class extends Animal class
public class AbstractSampleDog extends Animal22 {

	public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal22 obj = new AbstractSampleDog();
		obj.sound();
	   }
	}