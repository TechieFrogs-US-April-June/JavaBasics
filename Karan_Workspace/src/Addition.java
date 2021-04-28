import java.util.Scanner;

public class Addition {
     static int a;

     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          while (true) {

               System.out.println("enter the first number ::  ");

               if (scan.hasNextInt()) {
                    a = scan.nextInt();
                    break;
               } else {
                    scan.next();
               }
               System.out.println("Please enter INTEGER value");
          }

          while (true) {

               System.out.println("enter the second number ::  ");

               if (scan.hasNextInt()) {
                    a = a + scan.nextInt();
                    break;
               } else {
                    scan.next();
               }
               System.out.println("Please enter INTEGER value");
          }
          scan.close();
          System.out.println("result is ::  " + a);
     }
}