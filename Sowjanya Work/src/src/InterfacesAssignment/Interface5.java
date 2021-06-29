package InterfacesAssignment;

import java.util.Scanner;

interface FastFood {
    void addFries();
    void addCoke();
    void makeComboMeal();
}

class Sandwich implements FastFood {

    public void addFries() {
        System.out.println("Adding fries to your sandwich order..");
    }

    public void addCoke() {
        System.out.println("Adding coke to your sandwich order..");
    }

    public void makeComboMeal() {
        System.out.println("Adding fries and coke to your sandwich order as a combo");
    }
}

public class Interface5 {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to make a combo meal with fries and coke");
        System.out.println("Enter 2 to add coke to your sandwich");
        System.out.println("Enter 3 to add fries to your sandwich");
        System.out.println("Enter any key to exit without any addons");

        System.out.print("Please enter your choice: ");

        int choice = 0;
        boolean intChoice = sc.hasNextInt();
        if (intChoice) {
            choice = sc.nextInt();
        }

        switch (choice) {
            case 1:
                sandwich.makeComboMeal();
                break;
            case 2:
                sandwich.addCoke();
                break;
            case 3:
                sandwich.addFries();
                break;
            default:
                System.out.println("Just the sandwich");
                break;
        }
        sc.close();
    }
}
