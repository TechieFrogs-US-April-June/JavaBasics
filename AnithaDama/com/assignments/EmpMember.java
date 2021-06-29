/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department'
 respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and 
 print the same.*/

package com.assignments;
class Member
{
	String name;
	int age;
	long phoneNum;
	String address;
	int salary;
//	public void setmemberdetails(String m_name,int m_age,long m_pno,String m_add,int m_sal)

public void printSalary()
{
	System.out.println(salary);
}
}
class Employee extends Member
{
	String specialization;
	public void empdetails()
	{
		System.out.println("enter employee details");
		System.out.println(name +" "+age+ " " +phoneNum+ " "+address);
	}
}

class Manager extends Member
{
	String department;
	public void managerdetails()
	{
		System.out.println("enter manager details");
		System.out.println(name +" "+age+ " " +phoneNum+ " "+address);
	}
}


public class EmpMember {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name="abcd";
		emp.age=30;
		emp.phoneNum=123456789;
		emp.address="14xyz";
		emp.salary=2000;
		emp.specialization="xyzzzz";
		emp.empdetails();
		emp.printSalary();
		Manager m1=new Manager();
		m1.name="klmno";
		m1.age=20;
		m1.phoneNum=3561235;
		m1.address = "847xyz";
		m1.salary=9000;
		m1.department="computer";
		//emp.empdetails();
		//	emp.printSalary();
		m1.managerdetails();
			m1.printSalary();
	}	
	
				
		
				

	}


