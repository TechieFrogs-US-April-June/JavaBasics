package com.collections;

import java.util.HashSet;
import java.util.Set;

public class ConvertHStoArray {

	public static void main(String[] args) {
	Set<String> s = new HashSet<>();
	s.add("A");
	s.add("B");
	s.add("C");
String[] str = s.toArray(new String[s.size()]);
System.out.println(s);

	}

}
