package com.ls;

import java.util.Enumeration;
import java.util.Vector;

public class Driver43 {

	public static void main(String[] args) {
		Vector<String> al=new Vector();
		al.add("A");
		al.add("B");
		al.add("C");
		Enumeration<String>e=al.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
