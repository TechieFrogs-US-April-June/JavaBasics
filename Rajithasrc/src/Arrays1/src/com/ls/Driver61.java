package com.ls;

import java.util.HashSet;
import java.util.Set;

public class Driver61 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("B");
		s.add("C");
		s.add("A");
		
		String[] str=s.toArray(new String[s.size()]);
		for(String temp:str)
		{
			System.out.println(temp);
		}
	}

}
