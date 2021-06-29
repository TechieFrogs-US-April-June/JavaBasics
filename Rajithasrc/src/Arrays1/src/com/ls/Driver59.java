package com.ls;

import java.util.HashSet;
import java.util.Set;

public class Driver59 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("B");
		s.add("C");
		s.add("A");
		s.add(null);
		s.clear();
		System.out.println(s.size());
	}

}
