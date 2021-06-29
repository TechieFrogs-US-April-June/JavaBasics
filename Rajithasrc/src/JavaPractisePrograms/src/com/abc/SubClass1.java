package com.abc;

class Superclass11
{
   int num = 100;
}
class Subclass11 extends Superclass11
{
   int num = 110;
   void printNumber(){
	/* Note that instead of writing num we are
	 * writing super.num in the print statement
	 * this refers to the num variable of Superclass
	 */
	System.out.println(super.num);
   }
   public static void main(String args[]){
	Subclass11 obj= new Subclass11();
	obj.printNumber();	
   }
}