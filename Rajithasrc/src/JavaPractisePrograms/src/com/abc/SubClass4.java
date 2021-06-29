package com.abc;

class Parentclass12
{
   //no-arg constructor
   Parentclass12(){
	System.out.println("no-arg constructor of parent class");
   }
   //arg or parameterized constructor
   Parentclass12(String str){
	System.out.println("parameterized constructor of parent class");
   }
}
class Subclass4 extends Parentclass12
{
   Subclass4(){
       /* super() must be added to the first statement of constructor 
	* otherwise you will get a compilation error. Another important 
	* point to note is that when we explicitly use super in constructor
	* the compiler doesn't invoke the parent constructor automatically.
	*/
	super("Hahaha");
	System.out.println("Constructor of child class");

   }
   void display(){
	System.out.println("Hello");
   }
   public static void main(String args[]){		
	Subclass4 obj= new Subclass4();
	obj.display();	 
   }
}