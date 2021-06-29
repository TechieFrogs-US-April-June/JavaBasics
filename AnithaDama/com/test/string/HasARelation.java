package com.test.string;

public class HasARelation {

	public static void main(String[] args) {
		Address a1 = new Address(100,"colleriville");
		EmpHasA e1 = new EmpHasA(3,"Devi",a1);
		System.out.println(e1.getEno() + " " +e1.getEname());
		System.out.println(e1.getAddr().getHno() + " " +e1.getAddr().getLoc());
		a1.hno=200;
		a1.loc="abcs";
		
		System.out.println(e1.getAddr().getHno() + " " +e1.getAddr().getLoc());
	}

}
