package com.test.string;

//import java.util.StringTokenizer;

public class stringtoken {

	public static void main(String[] args) {
		String s1 = "Welcome to  java";
		/*StringTokenizer st = new StringTokenizer(s1," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}*/
		String[] sp = s1.split(" ");
		for(String t:sp)
		{
			System.out.println(t);
		}

	}

}
