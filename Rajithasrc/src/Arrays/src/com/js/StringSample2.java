package com.js;

public class StringSample2 {

	public static void main(String[] args) {
		String s=new String("RAJITHA");
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
