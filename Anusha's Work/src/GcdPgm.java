import java.util.Scanner;

public class GcdPgm {
    public static void main(String[] args) {
        int num1, num2, i,n, gcd=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two values to find GCD:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num1 < num2) {
            n = num1;
        } else {
            n = num2;
        }
        for(i=1;i<=n;i++){
            if(num1%i ==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("Greatest Common Divisor(GCD) of "+num1 +" and "+ num2 +" is "+gcd);
    }
}