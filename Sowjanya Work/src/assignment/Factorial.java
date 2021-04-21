package assignment;

public class Factorial {
    public static void main(String[] args) {
        //Factorial of 10 using for loop
        /*int n = 10;
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

         */



        //Factorial of 10 using while loop
        int n = 10;
        int fact = 1;

        int i = 1;
        while(i<=10){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+fact);




    }

}
