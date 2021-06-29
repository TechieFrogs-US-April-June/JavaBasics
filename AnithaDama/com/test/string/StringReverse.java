package com.test.string;

public class StringReverse {

	public static void main(String[] args) {
		String s = new String("Devika");
		
		char ch[] =s.toCharArray();
		String rev = " ";
		for(int i =ch.length-1;i>=0;i--)
			
		{
			rev = rev+ch[i];
		}
				
System.out.println(rev);
	}

}
