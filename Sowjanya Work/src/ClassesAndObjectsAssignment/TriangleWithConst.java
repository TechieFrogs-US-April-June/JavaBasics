package ClassesAndObjectsAssignment;

public class TriangleWithConst {
    private int side1;
    private int side2;
    private int side3;

    public TriangleWithConst(int side1, int side2, int side3) {
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
        TriangleWithConst triObj = new TriangleWithConst(3, 4, 5);
        int perim = triObj.perimeter();
        System.out.println("perimeter of triangle= " +perim);
        triObj.area();
    }
}
