package com.abc;

class FinalDemo{  

	   final int MAX_VALUE=99;
	   void myMethod(){  
	      MAX_VALUE=101;
	   }  
	   public static void main(String args[]){  
	      FinalDemo obj=new  FinalDemo();  
	      obj.myMethod();  
	   }  
	}
