package com.abc;
class Demo
{
   public int myMethod11(int num1, int num2)
   { 
       System.out.println("First myMethod of class Demo");
       return num1+num2;
   }
   public int myMethod11(int var1, int var2)
   {
       System.out.println("Second myMethod of class Demo");
       return var1-var2;
   }
public void disp2() {
	// TODO Auto-generated method stub
	
}
}
public class MethodOverloadingSample3 {

	 public static void main(String args[])
	   {
	       Demo obj1= new Demo();
	       obj1.myMethod11(10,10);
	       obj1.myMethod11(20,12);
	   }
	}