package com.ls;

public class StringSample23 {

	public static void main(String[] args) {
		String s1="Rajitha";
		String s2=new String("Rajitha");
		String s3="Rajitha";
		System.out.println(s1==s2);//== used to compare references not values
		System.out.println(s1==s3);
	}

}
