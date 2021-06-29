package InheritanceAssignment;

import java.util.Scanner;

public class TenSquaresProg5 extends Rectangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int i=1;
        while(i<=10) {
            int side = readNum(i, sc);
            sc.nextLine();

            Square sqr = new Square(side);
            sqr.area();
            sqr.perimeter();
            //sc.nextLine();
            i++;
        }
        System.out.println("Area and Perimeter of ten squares are printed");
        sc.close();
    }

    public static int readNum(int count, Scanner sc) {
        while(true) {
            System.out.print("Enter side of square "+count+": ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                return num;
            } else {
                System.out.println("Invalid number entered as side of the square. Please enter the side of the square "+count+" again.");
            }
            sc.nextLine();
        }
    }
}
