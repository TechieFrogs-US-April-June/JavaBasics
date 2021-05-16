package com.clasobj;

class Rectangle {

   int length, breadth;
   // rectangle constructor java
   Rectangle(int l, int b) 
   { 
      length = l; 
      breadth = b; 
   } 
   
   float area() 
   { 
      return(length * breadth); 
   }
}
public class Rectangle5 
{
   public static void main(String[] args)
   {
      Rectangle rs1 = new Rectangle(4, 5); 
      Rectangle rs2 = new Rectangle(5, 8); 
      System.out.println("Rectangle1 is : " + rs1.area());
      System.out.println("Rectangle2 is : " + rs2.area());
   }
}



