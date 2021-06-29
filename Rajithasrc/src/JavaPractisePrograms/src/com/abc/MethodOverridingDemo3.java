package com.abc;
class ABCDEF{
	   public void myMethod()
	   {
		System.out.println("Overridden method");
	   }	   
	}
public class MethodOverridingDemo3 extends ABCDEF{
	   public void myMethod(){
			//This will call the myMethod() of parent class
			super.myMethod();
			System.out.println("Overriding method");
		   }
		   public static void main( String args[]) {
			MethodOverridingDemo3 obj = new MethodOverridingDemo3();
			obj.myMethod();
		   }
		}
