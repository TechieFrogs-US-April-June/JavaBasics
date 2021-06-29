package com.aggregtn;

public class Studentclass 
{
	   int rollNum;
	   String studentName;
	   //Creating HAS-A relationship with Address class
	   Address studentAddr; 
	   Studentclass(int roll, String name, Address addr){
	       this.rollNum=roll;
	       this.studentName=name;
	       this.studentAddr = addr;
	   }
	   public static void main(String args[]){
	       Address ad = new Address(55, "Agra", "UP", "India");
	       Studentclass obj = new Studentclass(123, "Chaitanya", ad);
	       System.out.println(obj.rollNum);
	       System.out.println(obj.studentName);
	       System.out.println(obj.studentAddr.streetNum);
	       System.out.println(obj.studentAddr.city);
	       System.out.println(obj.studentAddr.state);
	       System.out.println(obj.studentAddr.country);
	   }
	}
