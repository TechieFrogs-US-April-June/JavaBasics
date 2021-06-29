package com.list;

import java.util.ArrayList;
import java.util.List;

//How to remove duplicate elements between 2 ArrayLists?

public class RemoveDupArrList {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Uma");
		l1.add("Nithya");
		l1.add("Parthiv");
		l1.add("Devika");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Uma");
		l2.add("Nithya");
		l2.add("Parthiv");
		l2.add("Anitha");
		
		l1.removeAll(l2);
		System.out.println(l1);
		System.out.println(l2);

	}

}
