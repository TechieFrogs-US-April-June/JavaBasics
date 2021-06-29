package com.finall;

public class Demo 
{  
	   final int MAX_VALUE=99;
	   void myMethod(){  
	      MAX_VALUE=101;
	   }  
	   public static void main(String args[]){  
	      Demo obj=new  Demo();  
	      obj.myMethod();  
	   }  
}
//We got a compilation error in the above program 
//because we tried to change the value of a final variable “MAX_VALUE”.