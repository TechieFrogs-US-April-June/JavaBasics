package com.ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver32 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();

		l1.add("Priyanka");
		l1.add("Gayatri");
		l1.add("Sowjanya");
		Collections.sort(l1);
		System.out.println(l1);

	}

}
