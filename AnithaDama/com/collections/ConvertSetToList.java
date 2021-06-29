package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetToList {

	public static void main(String[] args) {
	Set<String> set = new HashSet<>();
set.add("A");
set.add("B");
set.add("C");
List<String> list = new ArrayList<>();
for(String temp:set)
{
	list.add(temp);
	
}
System.out.println(list);
	}
	

}
