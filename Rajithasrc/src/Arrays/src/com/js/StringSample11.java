package com.js;

import java.util.StringTokenizer;

public class StringSample11 {

	public static void main(String[] args) {
		String s= "Welcome to Java";
		StringTokenizer st= new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
