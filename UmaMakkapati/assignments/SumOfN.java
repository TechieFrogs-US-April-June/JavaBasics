package assignments;

public class SumOfN {

	public static void main(String[] args) 
	{
	/*	//Using formula
		int i = 10;
		int sum = (i*(i+1))/2;
		System.out.println(sum);*/
		
		
		int num = 0;
		
		for(int i = 10; i>=1; i--) 
		{
			num = num+i;
		}
		System.out.println(num);
		
		//while Loop
		
		int j = 10;
		int sum = 0;
		while(j>=1)
		{
			sum = sum+j;
			j--;
			
		}
		System.out.println(sum);
	}

}
