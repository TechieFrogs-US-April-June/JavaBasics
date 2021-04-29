import java.util.Scanner;
//Prime number is a number that is greater than 1 and divided by 1 or itself only

class PrimeNumber
{
      // Natural number should be > 1
      // which has only 2 factors 1 and itself

    public static void main(String[] args)
    {
    
       /* int num = 3; // checking whether 13 is a prime number
        int count =0; 

        if(num>1) //13>1
        {
            for(int i=1;i<=num;i++) //1<=13; yes //2<=13; yes
            {
                if(num%i==0)  // 13/1 ==0; if yes go to count++; 13/2==0; No;
                count++;    // 0+1 =1
            }
                 if (count == 2)//count value =1; 1==2 ; no; goes to else
                {
                  System.out.println("This is a prime number");
                 }
                else
                 {
                   System.out.println("This is not a prime number");
                 }
        }
        else
        {
            System.out.println("This is not a prime number");
        }*/

        //Scannar Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime ");
        int num = sc.nextInt();
        int count =0; 

        if(num>1) //13>1
        {
            for(int i=1;i<=num;i++) //1<=13; yes //2<=13; yes
            {
                if(num%i==0)  // 13/1 ==0; if yes go to count++; 13/2==0; No;
                count++;    // 0+1 =1
            }
                 if (count == 2)//count value =1; 1==2 ; no; goes to else
                {
                  System.out.println("This is a prime number");
                 }
                else
                 {
                   System.out.println("This is not a prime number");
                 }
        }
        else
        {
            System.out.println("This is not a prime number");
        }
        sc.close();





    }
       /* System.out.println("prime number");
        System.out.println("This is not a prime number");
        System.out.println("not prime number");*/
 }

