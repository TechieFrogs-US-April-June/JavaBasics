package com.abc;
class XYZ{  
	   final void demo(){
	      System.out.println("XYZ Class Method");
	   }  
	}  
public class FinalMethodABC extends XYZ{  
	 public static void main(String args[]){  
	      FinalMethodABC obj= new FinalMethodABC();  
	      obj.demo();  
	   }  
	}