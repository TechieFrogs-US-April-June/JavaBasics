package AbstractSamples;
abstract class Shape1 {
    protected String color = "red";
    protected boolean filled = true;
    public Shape1() {

    }

    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape1{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
class Circle extends Shape1 {
    protected double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    

    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }

    
    public double getArea() {
        return Math.PI * this.radius * this. radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}
class Rectangle extends Shape1 {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }
    public double getPerimeter() {
        return 2*(this.length + this.width);
    }
}
class Square extends Rectangle {

    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                ", side=" + side +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }
     public double getPerimeter() {
        return 4*this.side;
    }
}

public class AbstractSample7 {

    public static void main(String[] args) {
        Circle sobj = new Circle(5.6);
        System.out.println("Area of circle using shape: "+sobj.getArea());
        System.out.println("Perimeter of circle using shape: "+sobj.getPerimeter());
       // System.out.println("Color of circle using shape: "+sobj.getColor());
        //System.out.println("isFilled of circle using shape: "+sobj.isFilled());

        Circle cobj = new Circle(3.5, "Pink", true);
        System.out.println("Radius of circle using circle: "+cobj.getRadius());
        System.out.println("Area of circle using circle: "+cobj.getArea());
        System.out.println("Perimeter of circle using circle: "+cobj.getPerimeter());
        System.out.println("Color of circle using circle: "+cobj.getColor());
        System.out.println("isFilled of circle using circle: "+cobj.isFilled());

        Rectangle robj = new Rectangle(7.8, 3.2);
        System.out.println("Area of rectangle using shape: "+robj.getArea());
        System.out.println("Perimeter of rectangle using shape: "+robj.getPerimeter());
        //System.out.println("Color of rectangle using shape: "+robj.getColor());
        //System.out.println("isFilled of rectangle using shape: "+robj.isFilled());

        Rectangle robj2 = new Rectangle(9.5, 6.2, "Red", true);
        System.out.println("Length of rectangle using rectangle: "+robj2.getLength());
        System.out.println("Width of rectangle using rectangle: "+robj2.getLength());
        System.out.println("Area of rectangle using rectangle: "+robj2.getArea());
        System.out.println("Perimeter of rectangle using rectangle: "+robj2.getPerimeter());
        System.out.println("Color of rectangle using rectangle: "+robj2.getColor());
        System.out.println("isFilled of rectangle using rectangle: "+robj2.isFilled());

        Square sqobj1 = new Square(4);
        System.out.println("Area of square using shape: "+sqobj1.getArea());
        System.out.println("Perimeter of square using shape: "+sqobj1.getPerimeter());
        //System.out.println("Color of square using shape: "+sqobj1.getColor());
       // System.out.println("isFilled of square using shape: "+sqobj1.isFilled());

        Rectangle sqobj2 = new Square(9.5, "Red", true);
        System.out.println("Length of square using rectangle: "+sqobj2.getLength());
        System.out.println("Width of square using rectangle: "+sqobj2.getLength());
        System.out.println("Area of square using rectangle: "+sqobj2.getArea());
        System.out.println("Perimeter of square using rectangle: "+sqobj2.getPerimeter());
        System.out.println("Color of square using rectangle: "+sqobj2.getColor());
        System.out.println("isFilled of square using rectangle: "+sqobj2.isFilled());

        Square sqobj3 = new Square(9, "Blue", true);
        System.out.println("Side of square using square: "+sqobj3.getSide());
        System.out.println("Length of square using square: "+sqobj3.getLength());
        System.out.println("Width of square using square: "+sqobj3.getLength());
        System.out.println("Area of square using square: "+sqobj3.getArea());
        System.out.println("Perimeter of square using square: "+sqobj3.getPerimeter());
        System.out.println("Color of square using square: "+sqobj3.getColor());
        System.out.println("isFilled of square using square: "+sqobj3.isFilled());


    }
    
}
