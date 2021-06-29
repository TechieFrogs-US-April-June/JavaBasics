package com.interrface;

//Variable names conflicts can be resolved by interface name.
public class Hello  implements A,B
{
    public static void Main(String args[])
    {
       /* reference to x is ambiguous both variables are x
        * so we are using interface name to resolve the 
        * variable
        */
       System.out.println(x); 
       System.out.println(A.x);
       System.out.println(B.x);
    }

}
