package AbstractAssignment;

abstract class Shape7 {
    protected String color = "red";
    protected boolean filled = true;
    public Shape7() {}
    public Shape7(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape7{" +
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

class Circle7 extends Shape7 {
    protected double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle7() {}

    public Circle7(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle7{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }

    public Circle7(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * this.radius * this. radius;
    }

    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}

class Rectangle7 extends Shape7 {
    double width = 1.0;
    double length = 1.0;

    public Rectangle7() {}

    public Rectangle7(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle7(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle7{" +
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

    double getArea() {
        return this.length * this.width;
    }
    double getPerimeter() {
        return 2*(this.length + this.width);
    }
}

class Square7 extends Rectangle7 {

    private double side;

    public Square7() {}

    public Square7(double side) {
        this.side = side;
    }

    public Square7(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square7{" +
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

    double getArea() {
        return this.side * this.side;
    }
    double getPerimeter() {
        return 4*this.side;
    }
}

public class Abstract7 {
    public static void main(String[] args) {
        Shape7 s1 = new Circle7(6.9);
        System.out.println("Area of circle using shape: "+s1.getArea());
        System.out.println("Perimeter of circle using shape: "+s1.getPerimeter());
        System.out.println("Color of circle using shape: "+s1.getColor());
        System.out.println("isFilled of circle using shape: "+s1.isFilled());

        Circle7 c1 = new Circle7(7.5, "Black", true);
        System.out.println("Radius of circle using circle: "+c1.getRadius());
        System.out.println("Area of circle using circle: "+c1.getArea());
        System.out.println("Perimeter of circle using circle: "+c1.getPerimeter());
        System.out.println("Color of circle using circle: "+c1.getColor());
        System.out.println("isFilled of circle using circle: "+c1.isFilled());

        Shape7 r1 = new Rectangle7(6.9, 4.5);
        System.out.println("Area of rectangle using shape: "+r1.getArea());
        System.out.println("Perimeter of rectangle using shape: "+r1.getPerimeter());
        System.out.println("Color of rectangle using shape: "+r1.getColor());
        System.out.println("isFilled of rectangle using shape: "+r1.isFilled());

        Rectangle7 r2 = new Rectangle7(7.5, 9.3, "Blue", true);
        System.out.println("Length of rectangle using rectangle: "+r2.getLength());
        System.out.println("Width of rectangle using rectangle: "+r2.getLength());
        System.out.println("Area of rectangle using rectangle: "+r2.getArea());
        System.out.println("Perimeter of rectangle using rectangle: "+r2.getPerimeter());
        System.out.println("Color of rectangle using rectangle: "+r2.getColor());
        System.out.println("isFilled of rectangle using rectangle: "+r2.isFilled());

        Shape7 sq1 = new Square7(5);
        System.out.println("Area of square using shape: "+sq1.getArea());
        System.out.println("Perimeter of square using shape: "+sq1.getPerimeter());
        System.out.println("Color of square using shape: "+sq1.getColor());
        System.out.println("isFilled of square using shape: "+sq1.isFilled());

        Rectangle7 sq2 = new Square7(7.5, "Blue", true);
        System.out.println("Length of square using rectangle: "+sq2.getLength());
        System.out.println("Width of square using rectangle: "+sq2.getLength());
        System.out.println("Area of square using rectangle: "+sq2.getArea());
        System.out.println("Perimeter of square using rectangle: "+sq2.getPerimeter());
        System.out.println("Color of square using rectangle: "+sq2.getColor());
        System.out.println("isFilled of square using rectangle: "+sq2.isFilled());

        Square7 sq3 = new Square7(9, "Blue", true);
        System.out.println("Side of square using square: "+sq3.getSide());
        System.out.println("Length of square using square: "+sq3.getLength());
        System.out.println("Width of square using square: "+sq3.getLength());
        System.out.println("Area of square using square: "+sq3.getArea());
        System.out.println("Perimeter of square using square: "+sq3.getPerimeter());
        System.out.println("Color of square using square: "+sq3.getColor());
        System.out.println("isFilled of square using square: "+sq3.isFilled());

    }
}
