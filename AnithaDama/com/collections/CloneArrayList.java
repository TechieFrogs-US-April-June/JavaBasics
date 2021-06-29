package com.collections;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
l1.add("abcd");
l1.add("bcde");
l1.add("cdef");
ArrayList al = (ArrayList)l1.clone();
System.out.println(al);
	}

}
