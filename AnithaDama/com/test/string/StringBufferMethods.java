package com.test.string;

public class StringBufferMethods {

	public static void main(String[] args) {
StringBuffer sb= new StringBuffer("Hello ");
//sb.append("java");//append()
//System.out.println(sb);//to.String
sb.insert(5, "java");
System.out.println(sb);

	}

}
