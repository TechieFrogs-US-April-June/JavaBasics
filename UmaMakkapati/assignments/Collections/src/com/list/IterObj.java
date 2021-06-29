package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterObj {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(3);
		l.add(2);
		l.add(1);
		//System.out.println(l);
		Iterator<Integer> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
