package assignments;

public class factorial {

	public static void main(String[] args) {
		
		int factorial = 1;
		
		for(int n = 5; n>1; n--) 
		
			factorial = factorial*n;
		
			System.out.println(factorial);
			
	
//while Loop

		int factorial1 = 1;
		int i = 5;
		while(i>1) 
		{
			factorial1 = factorial1 *i;
		i--;
		}
		System.out.println(factorial1);
	}

	}