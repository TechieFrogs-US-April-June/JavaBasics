package com.ls;

import java.io.IOException;

public class Driver8 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException 
	{
		
		Address addr=new Address(100,"Hyd");
		Emp8 emp=new Emp8(10,"Sowjanya","Dev",addr);
		System.out.println("depedentdent class hashCode"+emp.hashCode());
		System.out.println("indepedentdent class hashCode"+emp.getAddr().hashCode());
		
		Emp8 empClone =(Emp8)emp.clone();
		System.out.println("depedentdent class hashCode"+empClone.hashCode());
		System.out.println("indepedentdent class hashCode"+empClone.getAddr().hashCode());
		
		System.out.println(empClone.getEno()+"-"+empClone.getEname()+"-"+empClone.getDep());
		System.out.println(empClone.getAddr().getHno()+"-"+empClone.getAddr().getLoc());
	}
}