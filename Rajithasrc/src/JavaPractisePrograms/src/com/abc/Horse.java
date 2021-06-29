package com.abc;

public class Horse extends Aniaml {
	 @Override
	    public void sound(){
	        System.out.println("Neigh");
	    }
	    public static void main(String args[]){
	    	Animal obj = new Horse();
	    	obj.sound();
	    }
	}
