package ClassesAndObjectsAssignment;

public class RectangleProg5 {
    private int length;
    private int breadth;

    public RectangleProg5(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        RectangleProg5 rect1 = new RectangleProg5(4, 5);
        RectangleProg5 rect2 = new RectangleProg5(5, 8);
        int area1 = rect1.area();
        System.out.println("Area of rectangle1: "+area1);
        int area2 = rect2.area();
        System.out.println("Area of rectangle2: "+area2);
    }
}
