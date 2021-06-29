package com.abc;

public class GarbageCollectorExample{   
	   public static void main(String args[]){  
	        /* Here we are intentionally assigning a null 
	         * value to a reference so that the object becomes
	         * non reachable
	         */
		   GarbageCollectorExample obj=new GarbageCollectorExample();  
		obj=null;  
			
	        /* Here we are intentionally assigning reference a 
	         * to the another reference b to make the object referenced
	         * by b unusable.
	         */
		GarbageCollectorExample a = new GarbageCollectorExample();
		GarbageCollectorExample b = new GarbageCollectorExample();
		b = a;
		System.gc();  
	   }  
	   protected void finalize() throws Throwable
	   {
	        System.out.println("Garbage collection is performed by JVM");
	   }
	}