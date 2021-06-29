package com.ls;

public class StringSample2 {

	public static void main(String[] args) {
		String s1="VJ";
		String s2="Vj";
		
		boolean flag=s1.equals(s2);
		
		if(flag)
		{
			System.out.println("2 String objects are equal");
		}
		else
		{
			System.out.println("2 String objects are not equal");
		}

	}

}
