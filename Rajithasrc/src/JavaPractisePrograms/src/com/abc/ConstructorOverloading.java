package com.abc;

public class ConstructorOverloading {
	String web; 
	
	ConstructorOverloading(String w){
		web=w;
	}
	
	ConstructorOverloading(ConstructorOverloading je){
		web=je.web;
	}

	void  disp()
	{
		System.out.println("Website: "+web);
	}
	public static void main(String[] args) {
		ConstructorOverloading obj1= new ConstructorOverloading("BeginnersBook");
		ConstructorOverloading obj2= new ConstructorOverloading(obj1);
		obj1.disp();
		obj2.disp();

	}

}
