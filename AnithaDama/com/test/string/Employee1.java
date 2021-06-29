package com.test.string;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
//public class Employee1 implements Serializable
public class Employee1 implements Externalizable {
	int empno;
	String empname;
	String dept;
	public Employee1()
	{
		
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public Employee1(int empno, String empname, String dept) {
		
		this.empno = empno;
		this.empname = empname;
		this.dept = dept;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(empno);
		out.writeObject(empname);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		empno= in.readInt();
		empname=(String)in.readObject();
		
	}
	
	

}
