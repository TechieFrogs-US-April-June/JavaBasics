package com.variables;

public class InstanceVarEx {
	int a=10;//instance variable

	public static void main(String[] args) {
		InstanceVarEx i = new InstanceVarEx();
		InstanceVarEx i1 = new InstanceVarEx();
		InstanceVarEx i2 = new InstanceVarEx();
		System.out.println(i.a);
		System.out.println(i1.a);
		System.out.println(i2.a);
		i.a = 20;
		System.out.println(i.a);
		System.out.println(i1.a);
		System.out.println(i2.a);

	}

}
