package com.test.string;

public class Emp  {
	final int empno ;
	final String empname;
	public Emp(int no, String name) {
		
		empno = no;                           //userdefined object is immutable by using final keyword
		empname = name;
	}
	public int getEno() {
		return empno;
	}
	public String getEname() {
		return empname;
	}
	
	

}
