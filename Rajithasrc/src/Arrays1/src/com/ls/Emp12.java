package com.ls;

public class Emp12 {
	int eno;
	String ename;
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
	public Emp12(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
	
	public String toString()
	{
		return eno+"-"+ename;
	}

	public static void main(String[] args) {
		

	}

}
