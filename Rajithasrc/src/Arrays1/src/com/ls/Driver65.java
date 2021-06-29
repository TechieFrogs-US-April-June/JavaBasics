package com.ls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Driver65 {

	public static void main(String[] args) {
		Set<String> s=new CopyOnWriteArraySet();
		s.add("B");
		s.add("C");
		s.add("A");
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			s.add("F");
		}
	}

}
