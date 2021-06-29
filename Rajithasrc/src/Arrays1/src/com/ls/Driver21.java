package com.ls;

import java.util.ArrayList;
import java.util.List;

public class Driver21 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Gayatri");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		
		List<String> l2=new ArrayList<String>();
		l2.add("Gayatri");
		l2.add("Sowjanya");
		l2.add("Priyanka");
		l2.add("Manoj");
		
		boolean flag=l1.equals(l2);
		if(flag)
		{
			System.out.println("2 ArrayLists are equal");
		}
		else
		{
			System.out.println("2 ArrayLists are not equal");
		}

	}

}
