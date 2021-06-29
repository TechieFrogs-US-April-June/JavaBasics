package com.abstatn;

public class Demo1 extends MyClass{
	   /* Must Override this method while extending
	    * MyClas
	    */
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
	       Demo1 obj = new Demo1();
	       obj.disp2();
	   }
	}
