package com.abc;

public class EmployeeParameterConstructor {

	 int empId;  
	   String empName;  
		    
	   //parameterized constructor with two parameters
	   EmployeeParameterConstructor(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  
		   
	   public static void main(String args[]){  
		EmployeeParameterConstructor obj1 = new EmployeeParameterConstructor(10245,"Chaitanya");  
		EmployeeParameterConstructor obj2 = new EmployeeParameterConstructor(92232,"Negan");  
		obj1.info();  
		obj2.info();
	}

}
