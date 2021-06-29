import java.util.Scanner;

public class ArmstrongPgm {
    public static void main(String[] args) {
        int a,temp,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n= sc.nextInt();
        temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            b=b+(a*a*a);
        }
        if(b==temp)
        {
            System.out.println("Given is a Armstrong Number");
        }else{
            System.out.println("Given is not a Armstrong Number");
        }
    }
}
