package AbstractSamples;

abstract class Shape{
    abstract double RectangleArea(double length,double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}
class Area extends Shape{

    @Override
    double RectangleArea(double length, double breadth) {
        
        return length*breadth;
    }

    @Override
    double SquareArea(double side) {
        
        return side*side;
    }

    @Override
    double CircleArea(double radius) {
        
        return (22.0/7.0)*radius*radius;
    }
    
}
public class AbstractSample6 {

    public static void main(String[] args) {
        
        Area a= new Area();
        System.out.println("Area of Rectangle :  "+a.RectangleArea(5, 6));
        System.out.println("Area of Square :  "+a.SquareArea(5));
        System.out.println("Area of Circle :  "+a.CircleArea(7));
    }
    
}
