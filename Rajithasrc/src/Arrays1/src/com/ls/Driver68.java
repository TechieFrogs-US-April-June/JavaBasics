package com.ls;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Driver68 {

	public static void main(String[] args) {
		Set s= new TreeSet();
		s.add("B");
		s.add("C");
		s.add("A");
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
