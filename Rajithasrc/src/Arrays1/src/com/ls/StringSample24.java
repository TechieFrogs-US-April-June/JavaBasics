package com.ls;

public class StringSample24 {

	public static void main(String[] args) {
		String s="JAVA";
		char ch[]=s.toCharArray();
		for(int a=0;a<ch.length;a++)
		{
			if(ch[a]>='A'&&ch[a]<='Z')
			{
				ch[a]=(char)((int)ch[a]+32);
			}
			
			System.out.print(ch[a]);
		}
		
	}
	}
