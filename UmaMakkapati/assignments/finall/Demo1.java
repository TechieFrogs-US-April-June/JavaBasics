package com.finall;

public class Demo1 {  
	   //Blank final variable
	   final int MAX_VALUE;
		 
	   Demo1(){
	      //It must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
	      Demo1 obj=new  Demo1();  
	      obj.myMethod();  
	   }  
	}
	