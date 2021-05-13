package src.Assignments;

//Q8 : Find Factorial of a Number


public class FindFactorialOfANumber {
    public static void main(String[] args) {
      /*  int n = 10;
        int n1 = 1;
        int i;  
        for (i = 1; i<=n; i++)
        {
            n1 = n1 * i;
            System.out.println(i);
            System.out.println("Factorial of a Number " + n1);
            
        } */

      /* int j = 0;
       int j1 = 1;
       while (j<=10)
       {
         j++;
         System.out.println(j);
         j1 = j1 * j;
         System.out.println("Factorial of a Number " + j1);
       } */
        
       int f=1;
       int i=1;  
       do{  
       System.out.println(i); 
        i++;  
        f = f * i;
        System.out.println("Factorial of a Number " + f);
         }
        while(i<=10); 
    }
    
}
