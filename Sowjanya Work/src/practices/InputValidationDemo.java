package practices;

import java.util.Scanner;

public class InputValidationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = sc.nextInt();

        while(age < 0 || age > 100){
            System.out.println("Wrong age, try again " );
            age = sc.nextInt();
        }
        System.out.println("You are " + age + " years old ");
    }
}
