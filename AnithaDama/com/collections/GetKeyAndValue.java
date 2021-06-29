package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetKeyAndValue {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("A", "abc");
		m.put("B", "def");
		m.put("C", "Devi");
		m.put(null, null);
		m.put("F", null);
		Set<Entry<String,String>> s = m.entrySet();
		Iterator<Entry<String,String>> i = s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
	}

}
