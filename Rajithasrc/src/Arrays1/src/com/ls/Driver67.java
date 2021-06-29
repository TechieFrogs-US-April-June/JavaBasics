package com.ls;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver67 {

	public static void main(String[] args) {
		Set<String> s= new LinkedHashSet<String>();
		s.add("B");
		s.add("C");
		s.add("A");
		for(String temp:s)
		{
			System.out.println(temp);
		}

	}

}
