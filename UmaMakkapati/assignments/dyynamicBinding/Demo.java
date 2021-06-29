package com.dyynamicBinding;

public class Demo extends Human
	{
	   //Overriding Method
	   public void walk(){
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
	       Human obj = new Demo();
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
	       Human obj2 = new Human();
	       obj.walk();
	       obj2.walk();
	   }
	}