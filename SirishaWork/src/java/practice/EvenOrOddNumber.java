package java.practice;

public class EvenOrOddNumber {
    public static void main(String[] args)
    {
        System.out.println("Even number between 1 and 100: ");
        for(int a = 1; a <=100; a++)
        {
            if (a % 2 == 0)
            {
                System.out.println(a + "");
            }
        }

    }
}

