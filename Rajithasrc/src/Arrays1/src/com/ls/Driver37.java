package com.ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver37 {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		List<String>l=Collections.synchronizedList(al);
		System.out.println(l);
	}

}
