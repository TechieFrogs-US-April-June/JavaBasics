package com.superr;

public class PSubclass extends Parentclass
	{
	   PSubclass(){
		/* Compile implicitly adds super() here as the
		 *  first statement of this constructor.
		 */
		System.out.println("Constructor of child class");
	   }
	   PSubclass(int num){
		/* Even though it is a parameterized constructor.
		 * The compiler still adds the no-arg super() here
		 */
		System.out.println("arg constructor of child class");
	   }
	   void display(){
		System.out.println("Hello!");
	   }
	   public static void main(String args[]){
		/* Creating object using default constructor. This 
		 * will invoke child class constructor, which will 
		 * invoke parent class constructor
		 */
		PSubclass obj= new PSubclass();
		//Calling sub class method 
		obj.display();
		/* Creating second object using arg constructor
		 * it will invoke arg constructor of child class which will
		 * invoke no-arg constructor of parent class automatically 
		 */
		PSubclass obj2= new PSubclass(10);
		obj2.display();
	   }
	}
