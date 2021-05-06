package InheritanceAssignment;

class Circle1 {
    private double radius;
    private String color = "red";
    Circle1(){}
    Circle1(double radius) {
        this.radius = radius;
    }
    Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Cylinder extends Circle1 {
    private double height = 1.0;
    Cylinder(){}
    Cylinder(double radius) {
        super(radius);
    }
    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5.2, 9, "red");
        System.out.println("Volume of cylinder: "+cyl.getVolume());
        System.out.println("Area of circle: "+cyl.getArea());
    }
}
