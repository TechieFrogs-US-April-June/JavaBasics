package com.variables;

public class StaticVarEx {
	public static String name ="abcd";

	public static void main(String[] args) {
		
StaticVarEx s = new StaticVarEx();
StaticVarEx s1 = new StaticVarEx();
StaticVarEx s2 = new StaticVarEx();
System.out.println(s.name);
System.out.println(s1.name);
System.out.println(s2.name);
s1.name="def";
/*System.out.println(s.name);
System.out.println(s1.name);
System.out.println(s2.name);*/

System.out.println(name);
	}

}
