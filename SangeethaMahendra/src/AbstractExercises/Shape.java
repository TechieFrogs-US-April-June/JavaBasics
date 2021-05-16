package src.AbstractExercises;

abstract class Shape {

    int rectangle,square;
    double circle; 

    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(double radius);
}

class Area extends Shape{
    void RectangleArea(int length, int breadth){
        rectangle = length * breadth;
        System.out.println("The Area of a Rectangle ====>"+ rectangle);
    }
    void SquareArea(int side){
        square=side*side;
        System.out.println("The Area of Square ====> "+ square);
        
    }
    void CircleArea(double radius){
        circle = 3.14* radius* radius;
        System.out.println("The Area of Circle====> "+ circle);
    }
}

class output{
    public static void main(String[] args) {
        Area a = new Area();
        a.RectangleArea(5, 5);
        a.SquareArea(6);
        a.CircleArea(8);
    }
}
