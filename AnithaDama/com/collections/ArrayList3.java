package com.collections;
//ArrayList to SynchronizedList

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		List<String> l1 = Collections.synchronizedList(l);
		System.out.println(l1);
		

	}

}
