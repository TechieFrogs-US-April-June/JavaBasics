package com.oops;

public class OverloadingThis {
	private  int rollNum;
	OverloadingThis()
	{
		 rollNum = 100;
	}
	OverloadingThis(int rnum)
	{
		this();// this is used to calling default constructor from parameterized constructor,it  always should be the first statement
		rollNum =rollNum+rnum;
	}
	

	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public static void main(String[] args) {
		OverloadingThis obj1 = new OverloadingThis(12);
		System.out.println(obj1.rollNum);
		

	}

}
