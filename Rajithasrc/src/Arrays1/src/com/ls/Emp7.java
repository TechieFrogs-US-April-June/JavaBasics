package com.ls;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Emp7 implements Externalizable{
	int eno;
	String ename;
	String dep;
	public Emp7()
	{
		
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public Emp7(int eno, String ename, String dep) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dep = dep;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(eno);
		out.writeObject(eno);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		eno=in.readInt();
		ename=(String)in.readObject();
		
	}

}
