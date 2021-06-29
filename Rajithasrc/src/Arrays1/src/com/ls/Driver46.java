package com.ls;

import java.util.Iterator;
import java.util.Stack;

public class Driver46 {

	public static void main(String[] args) {
		Stack<String> al=new Stack();
		al.push("A");
		al.push("C");
		al.push("B");
		
		Iterator<String>i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
