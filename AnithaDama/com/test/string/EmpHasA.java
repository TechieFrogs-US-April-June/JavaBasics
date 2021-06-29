package com.test.string;

public final class EmpHasA {
final int eno ;
final String ename;
//HasA relationship
final Address addr;
public EmpHasA(int eno, String ename, Address addr) {
	
	this.eno = eno;
	this.ename = ename;
	//this.addr = addr;
	this.addr=new Address(addr.getHno(),addr.getLoc());
}
public int getEno() {
	return eno;
}
/*public void setEno(int eno) {
	this.eno = eno;
}*/
public String getEname() {
	return ename;
}
/*public void setEname(String ename) {
	this.ename = ename;
}*/
public Address getAddr() {
	return addr;
}
/*public void setAddr(Address addr) {
	this.addr = addr;
}*/

	
		

	}


