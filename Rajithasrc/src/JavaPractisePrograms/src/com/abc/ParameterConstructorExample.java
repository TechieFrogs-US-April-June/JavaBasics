package com.abc;

public class ParameterConstructorExample {
	 private int var;
	 
	 public ParameterConstructorExample() {
		 this.var=10;
	 }

	public ParameterConstructorExample(int num) {
		
		this.var = num;
	}

	public int getValue()
    {
            return var;
    }

	public static void main(String[] args) {
		
		ParameterConstructorExample obj=new ParameterConstructorExample();
		ParameterConstructorExample obj2= new ParameterConstructorExample(100);
		System.out.println("var is: "+obj.getValue());
        System.out.println("var is: "+obj2.getValue());
		
	}

}
