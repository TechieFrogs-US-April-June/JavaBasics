package com.encapsltn;

public class EncapsulationExample 
{
	   public static void main(String args[])
	   {
		  EmployeeCount obj = new EmployeeCount ();
	      obj.setNoOfEmployees(5613);
	      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
	    }
	}
