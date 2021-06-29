package com.abc;
class Human21{
	   //Overridden Method
	   public void walk()
	   {
	       System.out.println("Human walks");
	   }
	}

public class DynamicBindingDemo extends Human21{
	   //Overriding Method
	   public void walk(){
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
	       Human21 obj = new DynamicBindingDemo();
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
	       Human21 obj2 = new Human21();
	       obj.walk();
	       obj2.walk();
	   }
	}
