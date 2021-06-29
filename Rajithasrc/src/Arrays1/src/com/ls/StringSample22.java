package com.ls;

public class StringSample22 {

	public static void main(String[] args) {
		String s1="Rajitha";
		String s2="Rekha";
		String temp="";
		
		temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println("after swapping strings "+s1+" "+s2);
	}

}
