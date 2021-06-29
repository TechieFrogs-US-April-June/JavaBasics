/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes*/



package com.test.Abstract;
abstract class Bank
{
	abstract void getBalance();
}
class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("bank A balance : $100 ");
	}
	
}
class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("Bank B balance : $150");
	}
}
class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("Bank c balance : $200");
	}
}


public class AbstractProgram2 {

	public static void main(String[] args) {
		BankA a=new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
a.getBalance();
b.getBalance();
c.getBalance();
	}

}
