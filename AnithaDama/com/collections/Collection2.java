package com.collections;
//How to make ArrayList as immutable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection2 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Devika");
		l1.add("partiv");
		l1.add("arya");
		List<String> unmodifiableList = Collections.unmodifiableList(l1);
		unmodifiableList.add("Nitya");

	}

}
