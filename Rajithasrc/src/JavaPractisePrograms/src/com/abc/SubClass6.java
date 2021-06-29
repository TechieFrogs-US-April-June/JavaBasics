package com.abc;

class Parentclass14
{
   void display(){
	System.out.println("Parent class method");
   }
}
class Subclass6 extends Parentclass14
{
   void printMsg(){
	/* This would call method of parent class,
	 * no need to use super keyword because no other
	 * method with the same name is present in this class
	 */
	display();
   } 
   public static void main(String args[]){
		
	Subclass6 obj= new Subclass6();
        obj.printMsg(); 
   }
}