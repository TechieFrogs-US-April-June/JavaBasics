package com.js;

public final class Emp3 {
	
	final int eno;
	final String ename;
	final Address addr;
	
	

	public Emp3(int eno, String ename, Address addr) {
		
		this.eno = eno;
		this.ename = ename;
		this.addr = new Address(addr.getHno(),addr.getLoc());
	}

	


	public int getEno() {
		return eno;
	}




	public String getEname() {
		return ename;
	}




	public Address getAddr() {
		return addr;
	}




	public static void main(String[] args) {
		
	}

}
