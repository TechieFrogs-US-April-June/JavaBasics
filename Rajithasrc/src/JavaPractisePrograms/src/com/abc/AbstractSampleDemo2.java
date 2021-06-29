package com.abc;
abstract class MyClass{
	   public void disp(){
	     System.out.println("Concrete method of parent class");
	   }
	   
	   abstract public void disp2();
	}
public class AbstractSampleDemo2 extends MyClass{

	/* Must Override this method while extending
	    * MyClas
	    */
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
	       AbstractSampleDemo2 obj = new AbstractSampleDemo2();
	       obj.disp2();
	   }
	}