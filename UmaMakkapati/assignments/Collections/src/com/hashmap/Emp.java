package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Emp 	{
	
	public static void prCharWithFreq(String s) {
		 
		 Map<Character, Integer> oc = new HashMap<>();
		
		 for(int i = 0; i < s.length(); i++)
	        {
	           
	            // Print only if this
	            // character is not printed
	            // before
	            if(oc.get(s.charAt(i)) != 0)
	            {
	                System.out.print(s.charAt(i));
	                System.out.print(oc.get(s.charAt(i)) + " ");
	                oc.put(s.charAt(i), 0);
	            }           
	        }
	 }
	 public static void main(String[] args)
	 {
			String s = "Sowjanya";
			prCharWithFreq(s);

	  }
	
	}
	 
