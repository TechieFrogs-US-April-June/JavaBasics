package ClassesAndObjectsAssignment;

public class TriangleWithConstProg4 {
    private int side1;
    private int side2;
    private int side3;

    public TriangleWithConstProg4(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void area() {
        double s = perimeter()/2;
        double area = Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
        System.out.println("area of triangle: " + area);
    }
    int perimeter() {
        int perim = side1 + side2 + side3;
        return perim;
    }

    public static void main(String[] args) {
        TriangleWithConstProg4 triObj = new TriangleWithConstProg4(3, 4, 5);
        int perim = triObj.perimeter();
        System.out.println("perimeter of triangle= " +perim);
        triObj.area();
    }
}
