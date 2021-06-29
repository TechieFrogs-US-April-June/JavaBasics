package com.ls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver45 {

	public static void main(String[] args) {
		List<String> al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		
		LinkedList<String>ll=new LinkedList<>(al);
		System.out.println(ll);
	}

}
