import java.util.Scanner;
public class SumofNatualNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find sum of all natural numbers till that num ::  ");
        int a = scan.nextInt();
        scan.close();
        int b=1;
        int res=0;
        while (b<=a){
            res = res+b;
            b++;
        }
        System.out.println(res);
    }
}
