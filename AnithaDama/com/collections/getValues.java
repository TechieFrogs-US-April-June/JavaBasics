package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class getValues {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("A", "abc");
		m.put("B", "def");
		m.put("C", "Devi");
		m.put(null, null);
		m.put("F", null);
		Collection<String> value = m.values();
		Iterator<String> i = value.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
