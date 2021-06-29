package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIteration {

	public static void main(String[] args) {
		Vector<String> l1 = new Vector();
		l1.add("Devika");
		l1.add("Nithya");
		l1.add("Navya");
		Enumeration<String> e = l1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
