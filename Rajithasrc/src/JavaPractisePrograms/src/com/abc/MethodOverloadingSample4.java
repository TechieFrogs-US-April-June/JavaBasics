package com.abc;
class Demo2
{
   public double myMethod(int num1, int num2)
   {
      System.out.println("First myMethod of class Demo");
      return num1+num2;
   }
   public int myMethod(int var1, int var2)
   {
      System.out.println("Second myMethod of class Demo");
      return var1-var2;
   }
}
public class MethodOverloadingSample4 {

	public static void main(String args[])
	   {
	      Demo2 obj2= new Demo2();
	      obj2.myMethod(10,10);
	      obj2.myMethod(20,12);
	   }
	}