package assignment;

public class LargestNumber {
    public static void main(String[] args){
        int num1 = 70;
        int num2 = 120;
        int num3 = 60;
        if(num1>= num2 && num1>=num3)

            System.out.println(num1+ " is large value");
        else if(num2>=num1 && num2>=num3)

            System.out.println(num2+ " is large value");
        else
            System.out.println(num3+ " is large value");
    }
}
