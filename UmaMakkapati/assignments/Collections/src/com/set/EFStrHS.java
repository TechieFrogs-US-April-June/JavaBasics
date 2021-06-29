package com.set;

import java.util.HashSet;
import java.util.Set;

public class EFStrHS {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		s.add("Nithya");
		s.add("Devika");
		s.add("Parthiv");
		s.add(null);
		for(String temp:s)
		{
			System.out.println(temp);
		}
	}

}
