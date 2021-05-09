package ClassesAndObjectsAssignment;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);
        int area1 = rect1.area();
        System.out.println("Area of rectangle1: "+area1);
        int area2 = rect2.area();
        System.out.println("Area of rectangle2: "+area2);
    }
}
