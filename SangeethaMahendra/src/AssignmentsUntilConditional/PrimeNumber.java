class PrimeNumber
{
    public static void main(String[] args)
    {
        for (int i=2; i<=21; i++) // 2<=21; yes ; Post increment
        {
            if( i == 2 || i == 3) // 2 == 2; 
            {
                System.out.println(i +" is not a prime number.");
            }
           else 
           {
               if((i%2 != 0) && i%3 != 0)
               {
               System.out.println(i+" is a prime number.");
               }
               //else{
                //System.out.println(i +" is not a prime number.");
               //}
           }
        }
    }
       /* System.out.println("prime number");
        System.out.println("This is not a prime number");
        System.out.println("not prime number");*/
 }

