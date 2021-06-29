package com.abc;
class Human{
	   //Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }

	public void walk() {
		// TODO Auto-generated method stub
		
	}
	}
public class MethodOverridingBoy extends Human {

	 //Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
		   MethodOverridingBoy obj = new MethodOverridingBoy();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
	}