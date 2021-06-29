package com.abc;

public class StaticVarExample {
	public static String myClassVar="class or static variable";
	public static void main(String[] args) {
		StaticVarExample obj=new StaticVarExample();
        StaticVarExample obj2=new StaticVarExample();
        StaticVarExample obj3=new StaticVarExample();
        
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
        
        obj2.myClassVar="Changed Text";
        
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
        
        
   
        
	}

}
