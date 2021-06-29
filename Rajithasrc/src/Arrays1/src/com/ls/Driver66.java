package com.ls;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Driver66 {

	public static void main(String[] args) {
		Set<String> s= new LinkedHashSet<String>();
		s.add("B");
		s.add("C");
		s.add("A");
		Iterator<String> i= s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
				
				

	}

}
