package com.ls;

import java.util.HashMap;
import java.util.Map;

public class HashMapContainsValue {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
        Integer ky=30;
        m.put("A", 10);
        m.put("C", 30);
        boolean flag=m.containsValue(ky);
        if(flag)
        {
        	System.out.println("value exist");
        	
        }
        else
        {
        	System.out.println("value doesnot exist");
        }
	}

}
