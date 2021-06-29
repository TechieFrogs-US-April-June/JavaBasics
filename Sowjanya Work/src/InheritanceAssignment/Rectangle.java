package InheritanceAssignment;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {

    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area: " + (this.length * this.breadth));
    }
    public void perimeter() {
        System.out.println("Perimeter: "+ 2*(this.length+this.breadth));
    }
}
class Square extends Rectangle {
    private int side;

    public Square() {

    }

    public Square(int side) {
        super(side, side);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(8, 6);
        Square sqr = new Square(6);
        rect.area();
        rect.perimeter();
        sqr.area();sqr.perimeter();
    }
}