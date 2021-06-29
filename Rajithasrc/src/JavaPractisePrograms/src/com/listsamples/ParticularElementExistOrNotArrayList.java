package com.listsamples;

import java.util.ArrayList;
import java.util.List;

public class ParticularElementExistOrNotArrayList {

	public static void main(String[] args) {
		List<String> l1= new ArrayList<String>();
		String name="Sowjanya";
		l1.add("Gayatri");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		
		boolean flag = l1.contains(name);
		if(flag)
		{
			System.out.println("element exist");
		}
		else
		{
			System.out.println("element does not exist");
		}
	}

}
