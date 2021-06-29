package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Devika");
		l1.add("Partiv");
		l1.add("Nithya");
		List<String> l2 = new ArrayList<String>();
        l2.add("Arya");
        l2.add("pratysha");
        l2.add("Nithya");
       /* boolean flag = l1.equals(l2);
        if(flag)
        {
        	System.out.println("2 arraylist are equal");        //compare 2 arraylist
        	
        }
        else
        {
        	System.out.println("not equal");
        }*/
        
        //concatenate
        
      /*  l1.addAll(l2);                
        System.out.println(l1); */ 
        
      //Common element between 2 arraylist
        
      /*  l1.retainAll(l2);
        System.out.println(l1);*/ 
        
     // remove duplicate elements
        
        l1.removeAll(l2);
        System.out.println(l1);   
        
        //finding array size
        
        System.out.println(l1.size());
        
	}

}
