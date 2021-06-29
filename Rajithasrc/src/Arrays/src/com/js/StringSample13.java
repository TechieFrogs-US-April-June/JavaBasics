package com.js;

public class StringSample13 {

	public static void main(String[] args) {
		String s="Welcome to java";
		String[] sp=s.split(" ");
		int len=0;
		for(String t:sp) {
			len++;
		}

		
		System.out.println(len);
	}

}
