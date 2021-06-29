package com.list;

import java.util.ArrayList;

//Req:How to convert array to ArrayList?

public class ArrToAList {

	public static void main(String[] args) {
		
		String[] ar = {"Nithya","Uma","Parthiv","Sunil"};//{"A", "B", "C"};
		ArrayList<String> al = new ArrayList<String>();
		for(String temp:ar) 
		{
			al.add(temp);
		}
		System.out.println(al);
		
	}

}
