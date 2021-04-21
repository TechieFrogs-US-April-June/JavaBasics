import java.util.Scanner;
public class MulTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table ::  ");
        int a = scan.nextInt();
        System.out.println("Enter the multiplication table length ::  ");
        int x= scan.nextInt();
        scan.close();
        int res = 0;
        for(int i = 1; i <= x; i++)
        {
         res = a * i;
         System.out.println(a + " * " + i +  " = " + res);
        }
    }
}