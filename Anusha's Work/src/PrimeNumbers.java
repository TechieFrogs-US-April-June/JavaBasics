public class PrimeNumbers {
    public static void main(String[] args) {
       // int a=2;
        for(int a=2;a<=15;a++)
        {
            if ((a == 2 || a == 3) || (a % 2 != 0 && a % 3 != 0)) {
                System.out.println(a + " is a prime number");
            }
        }
    }
}
