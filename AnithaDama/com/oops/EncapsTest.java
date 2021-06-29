package com.oops;

public class EncapsTest {

	public static void main(String[] args) {
		EncapsulationDemo obj1 = new EncapsulationDemo();
		obj1.setSsn(12345);
		obj1.setEmpAge(20);
obj1.setEmpName("Devika");
System.out.println("emp ssn : " +obj1.getSsn());
System.out.println("emp Age : " +obj1.getEmpAge());
System.out.println("emp Name : " +obj1.getEmpName());
	}

}
