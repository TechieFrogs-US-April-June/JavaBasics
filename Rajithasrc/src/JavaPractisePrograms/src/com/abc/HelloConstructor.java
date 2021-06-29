package com.abc;

public class HelloConstructor {
	String name;
	   //Constructor
	   HelloConstructor(){
	      this.name = "BeginnersBook.com";
	   }
	   public static void main(String[] args) {
	      HelloConstructor obj = new HelloConstructor();
	      System.out.println(obj.name);
	}

}
