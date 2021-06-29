package com.collections;


public class Emp implements Comparable<Emp>
 
{
	int eno;
	String ename;
	public Emp(int eno, String ename) {
		
		this.eno = eno;
		this.ename = ename;
		
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
	@Override
	public int compareTo(Emp emp) {
	/*	if(this.eno>emp.getEno())    //based on eno
		return 1;
		else if(this.eno<emp.getEno())
			return -1;
		else
			return 0;*/
		//return this.ename.compareTo(emp.getEname());   //based on ename
		return emp.getEname().compareTo(this.ename);  // Descending order
	}
	public String toString() {
        return eno +" "+ename;
    }
	

}
