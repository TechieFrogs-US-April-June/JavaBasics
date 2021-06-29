package com.list;

import java.util.ArrayList;
import java.util.List;

//Req:How to display common data between 2 ArrayLists?

public class RetainAArrL {

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
		
		l1.retainAll(l2);//It displays common data from different collection object and it deletes the remaining data
		System.out.println(l1);
		System.out.println(l2);
	}

}
