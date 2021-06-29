package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//convert array to arraylist
public class Arraylist1 {

	public static void main(String[] args) {
		String[] str = {"a","b","c"} ;
	/*	ArrayList<String> a1 = new ArrayList<>();
		for(String temp:str)
		{
			a1.add(temp);
			
		}
		
		System.out.println(a1);*/
		
		List<String> a1 = Arrays.asList(str);
		System.out.println(a1);
	}

}
