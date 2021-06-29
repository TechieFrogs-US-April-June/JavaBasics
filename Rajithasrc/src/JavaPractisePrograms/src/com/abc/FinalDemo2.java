package com.abc;

class FinalDemo2{  
	   //Blank final variable
	   final int MAX_VALUE;
		 
	   FinalDemo2(){
	      //It must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
	      FinalDemo2 obj=new  FinalDemo2();  
	      obj.myMethod();  
	   }  
	}