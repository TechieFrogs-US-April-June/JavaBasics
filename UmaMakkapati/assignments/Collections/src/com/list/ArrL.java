package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrL {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("Nithya");
		l.add("Parthiv");
		l.add("Devika");
		Iterator<String> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
