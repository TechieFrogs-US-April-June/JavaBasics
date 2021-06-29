package com.ls;

public class Outer {

	private int n1=100;
	private int n2=200;
	
	class Inner
	{
    public void sum() {
    	System.out.println(n1+n2);
    }
	}
    public void show()
    {
    	new Inner().sum();
    }
    
	
	public static void main(String[] args) {
		

	}

}
