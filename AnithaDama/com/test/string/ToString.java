package com.test.string;

public class ToString {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//employee emp = new employee();
				
		//	emp.disp();
			
	//	System.out.println(emp.getClass().getName());
		//System.out.println(emp.toString());
					
		//	System.out.println(emp.hashCode());	
			Class c = Class.forName("com.test.String.employee");
			employee emp1 = (employee)c.newInstance();
			
emp1.disp();
	}

}
