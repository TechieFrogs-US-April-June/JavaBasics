package com.listsamples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<Integer> l= new ArrayList<Integer>();
		l.add(3);
		l.add(2);
		l.add(1);
		ListIterator<Integer> i=l.listIterator();
		System.out.println("Forward-Direction");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Backward Direction");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		
	}

}
