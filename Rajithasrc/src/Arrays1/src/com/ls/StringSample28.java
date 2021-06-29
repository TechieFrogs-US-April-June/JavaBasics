package com.ls;

public class StringSample28 {

	public static void main(String[] args) {
		String s1=new String("Talasila");
		StringBuffer sb=new StringBuffer("Talasila");
		boolean flag=s1.contentEquals(sb);
		
		System.out.println(flag);

	}

}
