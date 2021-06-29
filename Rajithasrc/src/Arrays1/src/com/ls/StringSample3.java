package com.ls;

public class StringSample3 {

	public static void main(String[] args) {
		String s1="VJ";
		String s2="Vj";
		
		boolean flag=s1.equalsIgnoreCase(s2);
		
		if(flag)
		{
			System.out.println("2 String Objects are equal ");
			
		}
		else
		{
			System.out.println("2 String Objects are not equal");
		}
	}

}
