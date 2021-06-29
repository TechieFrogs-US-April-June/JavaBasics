package com.ls;

import java.util.HashSet;
import java.util.Set;

public class Driver57 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("B");
		s.add("C");
		s.add("A");
		s.add(null);
		for(String temp:s)
		{
			System.out.println(temp);
		}
		
	}

}
