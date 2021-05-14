
/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100)
by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method
with the same name which returns the percentage of the students.
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
Create an object for eac of the two classes and print the percentage of marks for both the students.
________________________________________*/



package com.test.Abstract;
abstract class Marks
{
	abstract double getpercentage();
}
class StudentA extends Marks
{
int sub1, sub2, sub3;

	StudentA(int sub1,int sub2,int sub3 )
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public  double getpercentage()
	{
		double percentage = (sub1+sub2+sub3)*100/300;
		return percentage;
		//System.out.println(" Student A percentage :" +percentage);
	}
}
class StudentB extends Marks
{
	int sub1,sub2,sub3,sub4;
	StudentB(int sub1,int sub2, int sub3,int sub4)
    {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		}
	public double getpercentage()
	{
		double percentage = (sub1+sub2+sub3+sub4)*100/400;
		//System.out.println(" Student B percentage :" +percentage);
		return percentage;
	}
	}

public class AbstractProgram3 {

	public static void main(String[] args) {
		StudentA s1 = new StudentA(60,70,40);
		StudentB s2 = new StudentB(70,80,90,50);
		//s1.getpercentage();
		//s2.getpercentage();
		System.out.println("percentage of studentA : "+ s1.getpercentage());
		System.out.println(" percentage of studentB: " +s2.getpercentage());
		

	}

}
