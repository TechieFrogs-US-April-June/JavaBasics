public class Factorial {
    public static void main(String args[]){
        int factorialvalue=1;
        int input = 4;
        for (int i=1; i<=input; i++) 
        {
          // Calculating factorial
          factorialvalue=factorialvalue*i; 
        }
        System.out.println("The factorial of "+input+ " is "+ factorialvalue);
    }
}
