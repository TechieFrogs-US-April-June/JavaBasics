package com.ls;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Driver64 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("B");
		s.add("C");
		s.add("A");
		s.add(null);
		Set<String>unmodifiableSet=Collections.unmodifiableSet(s);
		unmodifiableSet.add("B");
	}

}
