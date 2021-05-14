package AbstractAssignment;

abstract class Shape {
    abstract void rectangleArea(int length, int breadth);
    abstract void squareArea(int side);
    abstract void circleArea(int radius);
}
class Area extends Shape {

    void rectangleArea(int length, int breadth) {
        System.out.println("Area of rectangle: "+length*breadth);
    }

    void squareArea(int side) {
        System.out.println("Area of square: "+side*side);
    }

    void circleArea(int radius) {
        System.out.println("Area of Circle: "+Math.PI * radius * radius);
    }
}
public class Abstract6 {
    public static void main(String[] args) {
        Area areaObj = new Area();
        areaObj.rectangleArea(5, 6);
        areaObj.squareArea(5);
        areaObj.circleArea(8);
    }
}
