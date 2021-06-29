package BeginnersAssignment.Operators;

public class BitwiseOperators {
    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 22;
        int result = 0;

        result = num1 & num2;
        System.out.println("num1 & num2: "+result);

        result = num1 | num2;
        System.out.println("num1 | num2: "+result);

        result = num1 ^ num2;
        System.out.println("num1 ^ num2: "+result);

        result = ~num1;
        System.out.println("~num1: "+result);

        result = num1 << 2;
        System.out.println("num1 << 2: "+result); result = num1 >> 2;
        System.out.println("num1 >> 2: "+result);
    }
}
