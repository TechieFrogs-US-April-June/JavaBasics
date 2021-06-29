package com.overridng;

public class Demo1 extends ABC1
{
	   public void myMethod(){
			//This will call the myMethod() of parent class
			super.myMethod();
			System.out.println("Overriding method");
		   }
		   public static void main( String args[])
		   {
			Demo1 obj = new Demo1();
			obj.myMethod();
		   }
		}
