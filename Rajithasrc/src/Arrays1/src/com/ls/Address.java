package com.ls;

public  class Address implements Cloneable
{
	int hno;
	String loc;
	public Address(int hno, String loc) 
	{
		this.hno = hno;
		this.loc = loc;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
