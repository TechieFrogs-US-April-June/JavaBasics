package com.js;

public class Emp {
	
	int eno;
	String ename;
	
	public Emp() {
		eno=100;
		ename="Anu";
	}
	
	public void display() {
		System.out.println(eno+"-"+ename);
	}
	
	public String toString() {
		return eno+"-"+ename;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
