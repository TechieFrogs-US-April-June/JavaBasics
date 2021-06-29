package com.list;

import java.util.ArrayList;
import java.util.List;

public class ALEqualM {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Uma");
		l1.add("Nithya");
		l1.add("Parthiv");
		
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Uma");
		l2.add("Nithya");
		l2.add("Parthiv");
		l2.add("Devika");
		
		boolean flag = l1.equals(l2);
		if(flag)
		{
			System.out.println("Array List are equal");
		}
		else
		{
			System.out.println("Array List are not equal");
		}

}
}