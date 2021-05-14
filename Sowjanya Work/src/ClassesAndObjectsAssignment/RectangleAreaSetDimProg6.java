package ClassesAndObjectsAssignment;

import java.util.Scanner;

public class RectangleAreaSetDimProg6 {
    private int length;
    private int breadth;

    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int length = readNum("length", sc);
            sc.nextLine();
            int breadth = readNum("breadth", sc);
            sc.nextLine();

            RectangleAreaSetDimProg6 rectangle = new RectangleAreaSetDimProg6();
            rectangle.setDim(length, breadth);
            int area = rectangle.getArea();
            System.out.println("Area of the rectangle: "+area);

            System.out.print("Please enter Y to continue or any key to exit: ");
            String nxt = sc.next().toUpperCase();
            if(!nxt.equals("Y")) {
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }

    public static int readNum(String count, Scanner sc) {
        while(true) {
            System.out.print("Enter "+count+" of rectangle: ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                return num;
            } else {
                System.out.println("Invalid number entered as " + count + ". Please enter the "+count+"number again.");
            }
            sc.nextLine();
        }
    }
}
