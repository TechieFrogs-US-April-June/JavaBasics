package com.constructr;

public class Example3 {

	private int var;
	
    public Example3(int num)
    {
           var=num;
    }
    public int getValue()
    {
            return var;
    }
    
    //If we remove the parameterized constructor from the above
    //code then the program would run fine, because then compiler 
    //would insert the default constructor into your code.
    public static void main(String args[])
    {
            Example3 myobj = new Example3(2);
            System.out.println("value of var is: "+myobj.getValue());
    }
}
