package com.abc;
class MyBaseClass11{
	   protected void disp()
	   {
	       System.out.println("Parent class method");
	   }
	}
public class MethodOverridingMyChildClass2  extends MyBaseClass11{
	   public void disp(){
		      System.out.println("Child class method");
		   }
		   public static void main( String args[]) {
		      MethodOverridingMyChildClass2 obj = new MethodOverridingMyChildClass2();
		      obj.disp();
		   }
		}