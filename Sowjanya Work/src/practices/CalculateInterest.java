package practices;

public class CalculateInterest {
    public static void main(String[] args) {
        for(int i = 2; i < 9; i++){
            System.out.println("10000 at "+ i +"% interest = " + calculateInterest(10000.0, i));
        }
    }

    public  static double calculateInterest(double amount, double interestRate){
        //System.out.println((interestRate/100));
        return(amount *(interestRate/100));
    }
}
