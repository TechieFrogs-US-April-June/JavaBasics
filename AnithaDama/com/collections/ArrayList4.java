package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Devika");
		l1.add("navya");
		l1.add("priyanka");
		List<String> unmodifiableList = Collections.unmodifiableList(l1);
		unmodifiableList.add("nitya");

	}

}
