package com.ls;

import java.util.ArrayList;
import java.util.List;

public class Driver23 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Gayatri");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		

		List<String> l2=new ArrayList<String>();
		l2.add("Praveen");
		l2.add("Vijay");
		l2.add("Priyanka");
		l2.add("Manoj");
		
		//l1.retainAll(l2);
		l1.removeAll(l2);
		System.out.println(l1);
		

	}

}
