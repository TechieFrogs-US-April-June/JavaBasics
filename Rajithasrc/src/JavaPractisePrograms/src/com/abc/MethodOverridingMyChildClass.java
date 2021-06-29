package com.abc;
class MyBaseClass{
	   public void disp()
	   {
	       System.out.println("Parent class method");
	   }
	}
public class MethodOverridingMyChildClass extends MyBaseClass{
	   protected void disp(){
		      System.out.println("Child class method");
		   }
		   public static void main( String args[]) {
		      MethodOverridingMyChildClass obj = new MethodOverridingMyChildClass();
		      obj.disp();
		   }
		}