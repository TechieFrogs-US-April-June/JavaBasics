package com.test;

public class EmpClone implements Cloneable{
	int eno;
	String ename;
	String dept;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public EmpClone(int eno, String ename, String dept) {
		
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
	}
	
	
	
	 public  Object clone() throws CloneNotSupportedException{
		return super.clone();
		 
	 }

}
