package com.abstatn;

public interface Multiply {

	 //abstract methods
	   public abstract int multiplyTwo(int n1, int n2);
	   
	   /* We need not to mention public and abstract in interface
	    * as all the methods in interface are 
	    * public and abstract by default so the compiler will
	    * treat this as 
	    * public abstract multiplyThree(int n1, int n2, int n3);
	    */
	   int multiplyThree(int n1, int n2, int n3);

	   /* Regular (or concrete) methods are not allowed in an interface
	    * so if I uncomment this method, you will get compilation error
	    * public void disp(){
	    *    System.out.println("I will give error if u uncomment me");
	    * }
	    */
	}
}
