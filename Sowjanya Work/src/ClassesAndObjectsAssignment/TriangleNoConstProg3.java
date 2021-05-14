package ClassesAndObjectsAssignment;

public class TriangleNoConstProg3 {
    private int side1;
    private int side2;
    private int side3;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    TriangleNoConstProg3() {

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
        TriangleNoConstProg3 triObj = new TriangleNoConstProg3();
        triObj.setSide1(3);
        triObj.setSide2(4);
        triObj.setSide3(5);
        int perim = triObj.perimeter();
        System.out.println("perimeter of triangle= " +perim);
        triObj.area();
    }
}
