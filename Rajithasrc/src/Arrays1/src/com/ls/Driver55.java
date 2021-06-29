package com.ls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Driver55 {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(10);
		s.add(10);
		s.add(true);
		s.add("A");
		s.add(null);
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
