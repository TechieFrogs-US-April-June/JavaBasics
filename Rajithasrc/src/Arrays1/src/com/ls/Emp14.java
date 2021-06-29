package com.ls;

public class Emp14 {

	int eno;
	String ename;
	String dep;
	
	
	public Emp14(int eno, String ename, String dep) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dep = dep;
	}

	public boolean equals(Object obj)
	{
		boolean flag=false;
		Emp14 emp=(Emp14)obj;
		if(this.eno==emp.eno && this.ename.equals(emp.ename)&& this.dep.equals(emp.dep))
		{
			flag=true;
			
		}
		else
		{
			flag=false;
		}
		return flag;
	}

	

}
