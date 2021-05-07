package src.Assignments;

public class ComputeQuotientAndRemainder {

    //Compute Quotient
    static float NUMBER1 = 100;
    static float NUMBER2 = 500;
    static float NUMBER3 = NUMBER1/NUMBER2;
    public static void main (String[] args)
    {
        int number1 = 120;
        int number2 = 10;
        int number3 = (number1/number2);
        System.out.println("Quotient of number1 and number2 is " + number3);

        System.out.println("Quotient of NUMBER1 and NUMBER2 is " + NUMBER3);

        //Compute Remainder
        int divNum1 = 301;
        int divNum2 = 17;
        int Remainder = (divNum1 % divNum2);
        System.out.println("Remainder of divNum1 and divNum2 =  " + Remainder);


    }
}
