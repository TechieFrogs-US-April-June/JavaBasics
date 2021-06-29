package com.ls;

public class StringSample17 {
	
	public void display() {
		String s=new String("Suneel");
		String s2=s.intern();
		System.out.println(s.equals(s2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
