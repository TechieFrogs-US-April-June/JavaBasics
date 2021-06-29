package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetKeys {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<String,String>();
		m.put("A", "abc");
		m.put("B", "def");
		m.put(null, "Devi");
		m.put(null, null);
		m.put("F", null);
		Set<String> s = m.keySet();
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
