package com.ls;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Driver41 {

	public static void main(String[] args) {
		List<String>al=new LinkedList<>();
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
