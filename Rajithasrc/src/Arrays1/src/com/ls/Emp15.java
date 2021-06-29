package com.ls;

public class Emp15 implements Comparable<Emp15>
{
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
	public Emp15(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public int compareTo(Emp15 emp)
	{
		return this.ename.compareTo(emp.getEname());
	}
	
	public String toString()
	{
		return eno+"-"+ename;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
