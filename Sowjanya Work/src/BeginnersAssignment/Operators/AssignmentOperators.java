package BeginnersAssignment.Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        num2 = num1;
        System.out.println("= Output: "+num2);

        num2 += num1; //num2 = 10 here
        System.out.println("+= Output: "+num2);

        num2 -= num1;//num2 = 20 here
        System.out.println("-= Output: "+num2);

        num2 *= num1;
        System.out.println("*= Output: "+num2);

        num2 /= num1;
        System.out.println("/= Output: "+num2);

        num2 %= num1;
        System.out.println("%= Output: "+num2);


    }
}
