package com.ls;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver40 {

	public static void main(String[] args) {
		List<String> al=new CopyOnWriteArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		Iterator<String>i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			al.add("D");
		}

	}

}
