package com.ls;

public class PolicySingleton {
static Policy p=null;
	
	private PolicySingleton()
	{
		
	}
	
	public static Policy getInstance()
	{
		if(p==null)
		{
			p=new Policy();
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
