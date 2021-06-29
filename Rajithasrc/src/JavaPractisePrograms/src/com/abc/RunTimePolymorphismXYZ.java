package com.abc;
class ABCFRFRE{
	   public void myMethod(){
		System.out.println("Overridden Method");
	   }
	}
public class RunTimePolymorphismXYZ extends ABCFRFRE{

	   public void myMethod(){
		System.out.println("Overriding Method");
	   }
	   public static void main(String args[]){
		ABCFRFRE obj = new RunTimePolymorphismXYZ();
		obj.myMethod();
	   }
	}
