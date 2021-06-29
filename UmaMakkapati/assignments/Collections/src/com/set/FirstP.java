package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FirstP {

	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add(10);
		s.add(10);
		s.add("Uma");
		s.add(null);
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	

}
