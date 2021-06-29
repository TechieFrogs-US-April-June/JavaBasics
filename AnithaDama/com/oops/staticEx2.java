package com.oops;

public class staticEx2 {
	static int no;
	String name;
	

	public static void main(String[] args) {
		staticEx2 obj1 = new staticEx2() ;
		staticEx2 obj2 = new staticEx2() ;
		obj1.no =80;
		obj1.name="Devika";
		obj2.no=90;
		obj2.name="parthiv";
		System.out.println("obj1 int " +obj1.no);
		System.out.println("obj1 name " +obj1.name);
		System.out.println(" obj2 int " +obj2.no);
		System.out.println(" obj2 name " +obj2.name);
		

	}

}
