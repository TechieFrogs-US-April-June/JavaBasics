package com.abc;

public class FinalStudentData {
	//Blank final variable
	   final int ROLL_NO;
		 
	   FinalStudentData(int rnum){
	      //It must be initialized in constructor
	      ROLL_NO=rnum;
	   }
	   void myMethod(){  
	      System.out.println("Roll no is:"+ROLL_NO);
	   }  
	   public static void main(String args[]){  
	      FinalStudentData obj=new  FinalStudentData(1234);  
	      obj.myMethod();  
	   }  
	}
