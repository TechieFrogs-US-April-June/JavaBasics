package assignment;

public class PrimeNumber {
    public static void main(String[] args){
        int num = 17;
        boolean pn = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                pn = true;
                break;
            }
        }

        if (!pn)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}






