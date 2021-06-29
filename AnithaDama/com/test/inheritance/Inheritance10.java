/*Consider a class Apple which is extended by class Banana. Class Apple contains a single integer member 'number_of_items'.
Class Banana contains an integer member 'number_of_items', 
a constructor and a member method show() which displays the values of member variable 'number_of_items' of class Apple and class Banana respectively .
Display them using the show() method
---------------------------------------------------------------------------------------------------------------*/

package com.test.inheritance;
class Apple
{
public void show( int no_of_items)
{
	System.out.println(" apples : " + no_of_items);
}
	
}
class Banana extends Apple
{
	public void show(int no_of_items)
	{
		System.out.println(" banana : " + no_of_items);
	}
}

public class Inheritance10 {

	public static void main(String[] args) {
		Banana b1= new Banana();
		b1.show(5);
		Apple a1=new Apple();
		a1.show(6);
				

	}

}
