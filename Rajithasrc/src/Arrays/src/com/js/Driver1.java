package com.js;

public class Driver1 {

	public static void main(String[] args) {
		
		//Address a1=new Address(100,"Blore");
		//Emp2 e2=new Emp2(10,"A",a1);
		//System.out.println(e2.getEno()+"-"+e2.getEname());
		//System.out.println(e2.getAddr().getHno()+"-"+e2.getAddr().getLoc());

		Address a1=new Address(100,"Blore");
		Emp3 e3=new Emp3(10,"A",a1);
		System.out.println(e3.getEno()+"-"+e3.getEname());
		System.out.println(e3.getAddr().getHno()+"-"+e3.getAddr().getLoc());
		
		a1.setHno(200);
		a1.setLoc("Hyd");
		
		System.out.println("------------------------------");
		System.out.println(e3.getAddr().getHno()+"-"+e3.getAddr().getLoc());
	}

}
