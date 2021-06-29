package com.arraList;

import java.util.ArrayList;
import java.util.List;

//to add elements to the ArrayList, use the add() method

public class AddMethd {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("ab");
		l.add("cd");
		l.add("gh");
		for(int i = 0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println(l+"2");
		for(String temp:l)
		{
			System.out.println(temp+"1");
		}
		System.out.println(l.get(1));//use the get() method and refer to the index number
		l.set(1, "Uma");//To modify an element, use the set() method and refer to the index number
		System.out.println(l);
		System.out.println(l.size());
		l.remove(1);//To remove an element, use the remove() method and refer to the index number
		System.out.println(l);
		l.clear();//To remove all the elements in the ArrayList, use the clear() method
		System.out.println(l);
	}

}
