package com.ls;

import java.util.Iterator;
import java.util.Vector;

public class Driver42 {

	public static void main(String[] args) {
		Vector<String>al=new Vector();
		al.add("A");
		al.add("B");
		al.add("C");
		Iterator<String>i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
