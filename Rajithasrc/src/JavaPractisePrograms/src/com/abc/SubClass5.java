package com.abc;

class Parentclass13
{
   //Overridden method
   void display(){
	System.out.println("Parent class method");
   }
}
class Subclass5 extends Parentclass13
{
   //Overriding method
   void display(){
	System.out.println("Child class method");
   }
   void printMsg(){
	//This would call Overriding method
	display();
	//This would call Overridden method
	super.display();
   }
   public static void main(String args[]){		
	Subclass5 obj= new Subclass5();
	obj.printMsg(); 
   }
}