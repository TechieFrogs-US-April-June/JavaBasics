package ClassesAndObjects;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the width of Triangle");
        double b = s.nextDouble();

        System.out.println("Enter the height of the Triangle");
        double h = s.nextDouble();

        //area = (width*height)/2
        double area = (b*h)/2;
        System.out.println("Area of triangle is : " + area);

    }
}
