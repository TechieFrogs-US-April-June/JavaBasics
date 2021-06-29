package com.ls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Driver56 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("B");
		s.add("C");
		s.add("A");
		s.add(null);
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
