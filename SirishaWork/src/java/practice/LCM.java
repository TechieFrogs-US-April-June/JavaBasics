package SirishaWork.src.java.practice;

import java.util.Scanner;

public class LCM {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int Num1, Num2, GCD = 0, LCM = 0;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter the First Integer Value : ");
        Num1 = sc.nextInt();

        System.out.print(" Please Enter the Second Integer Value : ");
        Num2 = sc.nextInt();

        int a = Num1;
        int b = Num2;

        while(Num2 != 0)
        {
            if(Num1 > Num2)
            {
                Num1 = Num1 - Num2;
            }
            else
            {
                Num2 = Num2 - Num1;
            }
        }
        GCD = Num1;
        System.out.println("\n GCD of " + a + " and " + b + "  =  " + GCD);

        LCM = (a * b) / GCD;
        System.out.println("\n LCM of " + a + " and " + b + "  =  " + LCM);
    }

}
