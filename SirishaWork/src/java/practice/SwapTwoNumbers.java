package java.practice;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 300;
        int y = 500;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x + " and y = " + y);
    }
}
