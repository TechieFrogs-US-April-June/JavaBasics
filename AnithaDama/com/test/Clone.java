package com.test;

public class Clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmpClone emp = new EmpClone(55,"Devika","abc");
		System.out.println(emp.hashCode());
		EmpClone empclone = (EmpClone)emp.clone();
		System.out.println(empclone.hashCode());
		System.out.println(empclone.getEno() +" " + empclone.getEname() +" " + empclone.getDept());
		
		
		

	}

}
