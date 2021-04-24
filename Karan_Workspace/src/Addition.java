import java.util.Scanner;

public class Addition {
    static int a;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number ::  ");

        if(scan.hasNextInt()){
             a = scan.nextInt();
        }else {System.out.println("Please enter INTEGER value");System.exit(1);}

        System.out.println("enter the second number ::  ");
        if(scan.hasNextInt()){
             a = a + scan.nextInt();
           }else {System.out.println("Please enter INTEGER value");}

         System.out.println("result is ::  " + a);         

    scan.close();
    }
}