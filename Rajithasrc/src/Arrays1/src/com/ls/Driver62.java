package com.ls;

import java.util.HashSet;
import java.util.Set;

public class Driver62 {

	public static void main(String[] args) {
		String[] str={"A","B","C"};
		Set<String>s=new HashSet<String>();
		for(String temp:str)
		{
			s.add(temp);
		}
		System.out.println(s);
		
	}

}
