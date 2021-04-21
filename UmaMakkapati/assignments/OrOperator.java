package assignments;

public class OrOperator {

	public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a>b || a<c);//true || true = true  (Logical-||-checks both condition)
		System.out.println(a>b | a<c);//true | true = true  (Bitwise-|checks only first if its false)
		//|| vs |  
		System.out.println(a>b || a++<c);//true || = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b | a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  
	    int x = 3;
	    int y = 5;
	    System.out.println(x <= y); // returns false because 5 is neither less than or equal to 3
	  }


	}


