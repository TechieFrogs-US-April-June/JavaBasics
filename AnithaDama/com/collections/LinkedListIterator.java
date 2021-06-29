package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIterator {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		Iterator<String> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
