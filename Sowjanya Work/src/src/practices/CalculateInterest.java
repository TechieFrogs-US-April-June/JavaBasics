package practices;

public class CalculateInterest {
    public static void main(String[] args) {
        //for 10000 amount Calculating interest from 2% to 8%

        //for(int i = 2; i < 9; i++){
        // System.out.println("10000 at "+ i +"% interest = " + calculateInterest(10000.0, i));
        // }
        // }
        //Same thing but from 8% to 2%
        for (int i = 8; i > 1; i--) {
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
    }

    public  static double calculateInterest(double amount, double interestRate){
        //System.out.println((interestRate/100));
        return(amount *(interestRate/100));
    }
}
