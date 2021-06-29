package com.test;

public class PolicySingleton {
	static Policy p = null;
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

}
