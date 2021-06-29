package com.ls;

import java.io.Serializable;

public class Emp4 implements Serializable{
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
	public Emp4(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
