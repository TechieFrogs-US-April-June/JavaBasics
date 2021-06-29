package com.ls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver72 {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("A","Hyd");
		m.put("C","Calcy");
		m.put("B","Bglr");
		m.put(null, null);
		m.put("F", null);
		Set<Entry<String,String>>st=m.entrySet();
		Iterator<Entry<String,String>>i=st.iterator();
		while(i.hasNext())
		   {
			   System.out.println(i.next());
		   }

	}

}
