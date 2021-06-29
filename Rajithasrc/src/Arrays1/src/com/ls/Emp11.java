package com.ls;

public class Emp11 implements Comparable<Emp11>
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
	public Emp11(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public int compareTo(Emp11 emp)
	{
		if(this.eno > emp.getEno())
			return 1;
		else if(this.eno < emp.getEno())
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		return eno+"-"+ename;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
