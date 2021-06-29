package com.ls;

public class Emp9 implements Cloneable {
	
	int eno;
	String ename;
	String dep;
	

	public Emp9(int eno, String ename, String dep) {
		
		this.eno = eno;
		this.ename = ename;
		this.dep = dep;
	}


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


	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
