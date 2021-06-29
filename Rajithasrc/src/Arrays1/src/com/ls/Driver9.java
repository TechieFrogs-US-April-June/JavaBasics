package com.ls;

import java.io.IOException;

public class Driver9 {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		Emp9 emp=new Emp9(10,"Sowjanya","Dev");
		System.out.println(emp.hashCode());
		Emp9 empClone=(Emp9)emp.clone();
		System.out.println(empClone.hashCode());
		System.out.println(empClone.getEno()+"-"+empClone.getEname()+"-"+empClone.getDep());

	}

}
