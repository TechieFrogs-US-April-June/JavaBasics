package src.ClassesObjectsExercises;

import java.util.Scanner;

//Q6: Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

//Class named Area
public class Area {
    int area;
    int l;
    int b;

    void setDim(int length, int breadth) { // method with parameters
        l = length;
        b = breadth;
        getArea(); // called getArea method inside the setDim method
    }

    // this method can not all from setDim methods parameter, so declare instance
    // variable and intialize setDim methods parameter and call here in this method
    void getArea() {

        area = l * b; // method named 'Area' which returns the area of the rectangle
        System.out.println(" Print the area of the rectangle in the Method : " + area);
        // return area;
    }

    // Q7: Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its
    // constructor and having a method named 'returnArea' which returns the area of the rectangle.
    // Length and breadth of rectangle are entered through keyboard.
    Area() {};
    Area(int len, int bre) {
        this.l = len;
        this.b = bre;
    }
     
     void returnArea(){
         area = l * b;
         System.out.println(" Print the area of the rectangle in the Constructor : " + area);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length :  ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth :  ");
        int breadth = sc.nextInt();
        Area a = new Area();
        a.setDim(length, breadth);
        a.returnArea();
        sc.close();

    }

}
