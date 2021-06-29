package com.overridng;

public class MyChildClass extends MyBaseclass
{
	  // protected void disp(){
		   public void disp(){
		      System.out.println("Child class method");
		   }
		   public static void main( String args[]) {
		      MyChildClass obj = new MyChildClass();
		      obj.disp();
		   }
		}
//Exception in thread "main" java.lang.Error: Unresolved compilation 
//problem: Cannot reduce the visibility of the inherited method from MyBaseClass