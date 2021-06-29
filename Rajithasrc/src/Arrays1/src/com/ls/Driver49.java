package com.ls;

import java.util.Stack;

public class Driver49 {

	public static void main(String[] args) {
		Stack<String> al=new Stack();
		String ele="A";
		al.push("A");
		al.push("C");
		al.push("B");
		int search=al.search("A");
		System.out.println(search);
	}

}
