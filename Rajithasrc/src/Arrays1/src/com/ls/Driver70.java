package com.ls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Driver70 {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("A","Hyd");
		m.put("C","Calcy");
		m.put("B","Bglr");
		m.put(null, null);
		m.put("F", null);
		Set<String> keySet=m.keySet();
        Iterator<String> i=keySet.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
	}

}
