package SirishaWork.src.java.practice;

import java.util.Scanner;

public class ValidateIntegers {

    public static void main(String[] args)
    {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        num1 = sc.nextInt();
        System.out.println("Second number : ");
        num2 = sc.nextInt();
        sum = addTwo(num1, num2);
        System.out.println("Sum : " + sum);
        sc.close();
    }
    public static int addTwo(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
}

    //int c;
   // public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);



       /* do {
            System.out.println("Enter the positive number");
            //checks if the next token is integer or not
            while(!sc.hasNextInt())
            {
                System.out.println("This is not a number");
                sc.next();
            }
            if (a>0)
            //got integer num
                a = sc.nextInt();
            if (b>0)
                 b = sc.nextInt();
            num = a + b;

            //checks if the number is positive or not
        }while (num<=0);
        System.out.println("It is a number : "+num);


    }

}*/



    /*public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int sum = a + b;
        System.out.println(sum);
    }
}*/