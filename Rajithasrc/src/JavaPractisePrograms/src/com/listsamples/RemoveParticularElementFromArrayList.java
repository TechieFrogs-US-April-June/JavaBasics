package com.listsamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveParticularElementFromArrayList {

	public static void main(String[] args) {
		List<String> l1= new ArrayList<String>();
		
		l1.add("SriRam");
		l1.add("Ganesh");
		l1.add("Pradeep");
		
		//l1.remove(2);
		l1.remove("Ganesh");
		System.out.println(l1);
	}

}
