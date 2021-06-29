package com.ls;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Driver44 {

	public static void main(String[] args) {
		List<String>al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		Vector<String>v= new Vector<>(al);
		System.out.println(v);
	}

}
