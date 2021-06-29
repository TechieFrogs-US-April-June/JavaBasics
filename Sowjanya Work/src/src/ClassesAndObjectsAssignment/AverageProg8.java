package ClassesAndObjectsAssignment;

import java.util.Scanner;

public class AverageProg8 {
    private int num1;
    private int num2;
    private int num3;

    void calculateAvg() {
        double avg = (num1+num2+num3)/3.0;
        System.out.println("Average of the numbers: "+avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int first = readNum("first", sc);
            sc.nextLine();
            int second = readNum("second", sc);
            sc.nextLine();
            int third = readNum("third", sc);

            AverageProg8 avg = new AverageProg8();
            avg.setNum1(first);
            avg.setNum2(second);
            avg.setNum3(third);

            avg.calculateAvg();

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
            System.out.print("Enter "+count+" number: ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                return num;
            } else {
                System.out.println("Invalid " + count + "number. Please enter the number again.");
            }
            sc.nextLine();
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
}
