package JavaBasicsAssignment;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int org_num = num;
        int sum=0;

        while(num>0) {
            int rem = num%10;
            sum += rem * rem * rem;
            num = num/10;
        }
        if(sum==org_num) {
            System.out.println(org_num+" is an amstrong number");
        } else {
            System.out.println(org_num+" is not an amstrong number");
        }
    }
}
