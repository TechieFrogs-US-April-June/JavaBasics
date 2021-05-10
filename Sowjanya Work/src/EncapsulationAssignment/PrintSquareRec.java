package EncapsulationAssignment;

public class PrintSquareRec {

    public void area(int length, int breadth) {
        System.out.println("Area of rectangle: "+ length * breadth);
    }

    public void area(int side) {
        System.out.println("Area of Square: "+ side * side);
    }

    public static void main(String[] args) {
        PrintSquareRec clssObj = new PrintSquareRec();
        clssObj.area(5, 6);
        clssObj.area(8);
    }
}
