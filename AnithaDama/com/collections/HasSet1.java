package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class HasSet1 {

	public static void main(String[] args) {
		Set<String> s = new CopyOnWriteArraySet<>();
		s.add("A");
		s.add(null);
		s.add("C");
		s.add("A");
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			s.add("B");
		}

	}

}
