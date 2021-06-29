package com.ls;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Driver71 {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("A","Hyd");
		m.put("C","Calcy");
		m.put("B","Bglr");
		m.put(null, null);
		m.put("F", null);
		Collection<String> values=m.values();
		Iterator<String>i=values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
