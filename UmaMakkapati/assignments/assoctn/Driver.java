package com.assoctn;

public class Driver extends Carclass
{
	   String driverName;
	   Driver(String name, String cname, int cid){
		super(cname, cid);
		this.driverName=name;
	   }
	}