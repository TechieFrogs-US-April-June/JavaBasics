//static method accessed directly in static and non static method
package com.oops;

public class StaticEx3 {
	static int no = 20;;
	static String name = "Devika";
	static void disp()
	{
		System.out.println("no is : " +no);
		System.out.println("name is : " +name);
	}
	//non-static method
	void info()
	{
		disp();//static method called in non-static method
	}

	public static void main(String[] args) {
		StaticEx3 obj1 = new StaticEx3();
		obj1.info();
		disp();

	}

}
