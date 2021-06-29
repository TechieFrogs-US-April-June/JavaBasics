package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//import java.util.Iterator;
import java.util.Set;

//StrinHashSet-HomogeneousData using enhanced for loop and Iterator 

public class StrHS {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("Nithya");
		s.add("Devika");
		s.add("Parthiv");
		s.add("Parthiv");
		s.add(null);
		
		List<String> l = new LinkedList<String>(s);
		
		System.out.println(l);
		for(int i=0; i<=l.size()-1; i++ )
		{
			System.out.println(l.get(i));
		}
		/*Iterator<String> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		for(String temp:l)
		{
			System.out.println(temp);
		}*/
	}

}
