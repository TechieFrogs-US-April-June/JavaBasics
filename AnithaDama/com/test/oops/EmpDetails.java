/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. 
 * The output should be as follows:
 */
/*Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/



package com.test.oops;
class Employee
{
	String Name;
	int YearOfJoining;
	String Address;
	Employee(String Name,int YearOfJoining,String Address)
	{
		this.Name=Name;
		this.YearOfJoining=YearOfJoining;
		this.Address=Address;
	}
	
	static {
System.out.println("Name" + "  " +"yearofJoining" + "  " +"Address");

	}
	void display()
	{
		System.out.println(Name + "   " +YearOfJoining + "     " + Address);
	}
}

public class EmpDetails {

	public static void main(String[] args) {
		
		Employee e1 =new Employee("Robert" , 1994 ,"64c-WallsStreet");
		Employee e2 = new Employee(" Sam " , 2000 , " 68D-WallsStreet ");
		Employee e3 = new Employee(" John ",1999,"26B-WallsStreet");
		e1.display();
		e2.display();
		e3.display();
		

	
	
}
}