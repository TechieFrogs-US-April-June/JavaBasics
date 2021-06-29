package com.set;

import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;

//IntegerHashSet-Homogeneous Data-using enhanced for loop and Iterator 

public class IntHS {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(null);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(null);
		/*Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		for(Integer temp:s)
		{
			System.out.println(temp);
		}
		
	}

}
