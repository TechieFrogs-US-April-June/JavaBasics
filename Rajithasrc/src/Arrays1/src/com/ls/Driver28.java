package com.ls;

import java.util.ArrayList;
import java.util.List;

public class Driver28 {

	public static void main(String[] args) {
		List<String>l1=new ArrayList<String>();

		l1.add("Gayatri");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		l1.clear();
		
		boolean flag=l1.isEmpty();
		if(flag)
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}

	}

}
