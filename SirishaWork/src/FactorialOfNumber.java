public class FactorialOfNumber {
    public static void main(String[] args) {

        int factorial = 1;
        //for loop
        for (int i = 5; i >1; i--) {
            System.out.println(i);
            factorial *= i;
        }
        System.out.println(factorial);
    }
}


