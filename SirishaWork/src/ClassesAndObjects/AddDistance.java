package SirishaWork.src.ClassesAndObjects;

import java.util.Scanner;

public class AddDistance {
        private int feet;
        private int inches;

        public void getDistance() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter feet: ");
            feet = sc.nextInt();
            System.out.print("Enter inches: ");
            inches = sc.nextInt();
        }

        public void showDistance() {
            System.out.println("Feet: " + feet + "\tInches: " + inches);
        }

        public void addDistance(AddDistance D1, AddDistance D2) {
            inches = D1.inches + D2.inches;
            feet = D1.feet + D2.feet + (inches / 12);
            inches = inches % 12;
        }
    }

