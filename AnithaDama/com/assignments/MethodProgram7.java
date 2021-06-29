/*A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'. Its subclass also has an integer data member 'j' and
a method named 'printNum' to print the value of 'j'. Make an object of the subclass and use it to assign a value to 'i' and to 'j'. 
Now call the method 'printNum' by this object.
________________________________________*/



package com.assignments;
class Integer1
{
	int i;

public void printNum()

{
	System.out.println(" i value : " +i);
}
}
class Integer2 extends Integer1
{
	int j ;
	public void printNum()
	{
	System.out.println(" j value :" +j);
}
	
}

public class MethodProgram7 {

	public static void main(String[] args) {
		Integer2 int2 = new Integer2();
		int2.i=5;
		int2.j=6;
		
		int2.printNum();
				
		

	}

}
