package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class convertALtoVector {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		Vector<String> v = new Vector<>(l) ;
		System.out.println(l);

	}

}
