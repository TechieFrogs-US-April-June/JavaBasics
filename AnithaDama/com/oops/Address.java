package com.oops;

public class Address {
	int StreetNo;
	String city;
	String State;
	public Address(int streetNo, String city, String state) {
		
		StreetNo = streetNo;
		this.city = city;
		State = state;
	}
	

}
class StudentInfo
{
	int Sno;
	String Sname;
	Address StuAddr;
	public StudentInfo(int sno, String sname, Address stuAddr) {
		
		Sno = sno;
		Sname = sname;
		StuAddr = stuAddr;
	}
	
}
class College
{
	String CollName;
	Address CollAddr;
	public College(String collName, Address collAddr) {
		super();
		CollName = collName;
		CollAddr = collAddr;
	}
}	
