package com.ls;

public  class Emp8 implements Cloneable
{
	int eno;
	String ename;
	String dep;
	
	public Address addr;
	
	
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


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}
	

	public Emp8(int eno, String ename, String dep, Address addr) {
		this.eno = eno;
		this.ename = ename;
		this.dep = dep;
		this.addr = addr;
	}


	public  Object clone() throws CloneNotSupportedException
	{
		Emp8 empClone=(Emp8)super.clone();
		Address addrClone=(Address)addr.clone();
		empClone.setAddr(addrClone);
		return empClone;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
