package com.oops.Interface;

public interface Servicing {
	int getServiceTime();
	

}
class Car implements Servicing
{
	public int getServiceTime()
	{
		return 2;
	}
}
class Bike implements Servicing
{
	public int getServiceTime()
	{
		return 3;
	}
}
