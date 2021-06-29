package com.abc;
class DisplayOverloading11
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}

public class OverloadingSample {

	public static void main(String args[])
	   {
	       DisplayOverloading11 obj = new DisplayOverloading11();
	       obj.disp('a');
	       obj.disp('a',10);
	}

}
