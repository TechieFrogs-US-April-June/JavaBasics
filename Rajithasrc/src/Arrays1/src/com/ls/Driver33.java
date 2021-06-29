package com.ls;

import java.util.ArrayList;

public class Driver33 {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Priyanka");
		l1.add("Gayatri");
		l1.add("Sowjanya");
		ArrayList a1=(ArrayList)l1.clone();
		System.out.println(a1);

	}

}
