package com.ls;

public class Emp16 implements Comparable<Emp16>
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
	public Emp16(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public int compareTo(Emp16 emp)
	{
		return emp.getEname().compareTo(this.ename);
	}
	
	public String toString()
	{
		return eno+"-"+ename;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
