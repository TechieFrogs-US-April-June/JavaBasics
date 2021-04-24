package assignment;

public class PrimeNumber {
    public static void main(String[] args){
        int n = 5;
        boolean pn = false;
        for (int i = 2; i <= n/2; i++) { // Alternative for loop for(int i=2; i<=(long) math.sqrt(n); i++)
            // condition for nonprime number
            if (n % i == 0) {
                pn = true;
                break;
            }
        }

        if (!pn)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}






