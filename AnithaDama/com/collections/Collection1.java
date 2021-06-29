package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection1 {

	public static void main(String[] args) {
List l = new ArrayList();
l.add(1);
l.add("Devika");
l.add(true);
l.add(null);
l.add(true);
System.out.println(l);

List<Integer> l1 = new ArrayList<Integer>();
{
	l1.add(3);
	l1.add(2);
	l1.add(1);
	ListIterator<Integer> i = l1.listIterator();
	System.out.println("forward direction");
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("backward direction");
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
}


	}

}
