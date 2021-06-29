package com.superr;

public class Subclass2 extends Parentclass2 {
	
		   //Overriding method
		   void display(){
			System.out.println("Child class method");
		   }
		   void printMsg(){
			//This would call Overriding method
			display();
			//This would call Overridden method
			super.display();
			display();
		   }
		   public static void main(String args[]){		
			Subclass2 obj= new Subclass2();
			obj.printMsg(); 
		   }
		}
