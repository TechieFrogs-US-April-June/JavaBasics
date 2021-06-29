package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods1 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("devika");
		l1.add("partiv");
		l1.add("nitya");                       // Add element at particular position
		l1.add("pragati");
	//	l1.add(1, "Nalini");
		//System.out.println(l1);
		
    /* l1.remove(0);                   //remove particular element
     System.out.println(l1);*/
		
		/*l1.set(0, "Bhavana");            //replace particular element
		System.out.println(l1); */
		
		Collections.sort(l1);           // sort collection data
		System.out.println(l1);
	}

}
