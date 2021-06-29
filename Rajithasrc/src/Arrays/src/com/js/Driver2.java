package com.js;

public class Driver2 {

	public static void main(String[] args) {
		Emp4 e4=new Emp4(10,"A");
		Emp5 e5=new Emp5(10,"A");
		
		//System.out.println(e4);
		//System.out.println(e4.toString());
		System.out.println(e5 instanceof Emp5);
		if(e5 instanceof Emp5) {
			e5.disp();
		}

	}

}
