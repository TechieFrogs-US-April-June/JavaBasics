package com.test.string;

public class StringMethods {

	public static void main(String[] args) {
		//String s = "  Java ";
		String s = "SoftwareDeveloper";
		System.out.println(s);
		System.out.println(s.trim());//trim()
		System.out.println(s.startsWith("s"));//startwith() method
		System.out.println(s.endsWith("r"));//endwith() method
System.out.println(s.charAt(6));//charAt() method
System.out.println(s.length());//length() method
          int n=5;
          String s1= String.valueOf(n);// value of()
          System.out.println(s1+5);
         String s2= "Java is a programming language. Java is a platform. Java is an Island." ;
         String replaceString = s2.replace("Java", "kova");//replace() method
         System.out.println(replaceString);
	}

}
