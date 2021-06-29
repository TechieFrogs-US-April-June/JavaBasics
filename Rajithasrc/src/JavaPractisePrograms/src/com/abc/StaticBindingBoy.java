package com.abc;
class Human12{
	   public static void walk()
	   {
	       System.out.println("Human walks");
	   }
	}

public class StaticBindingBoy extends Human12{
	   public static void walk(){
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
	       Human12 obj = new StaticBindingBoy();
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
	       Human12 obj2 = new Human12();
	       obj.walk();
	       obj2.walk();
	   }
	}
