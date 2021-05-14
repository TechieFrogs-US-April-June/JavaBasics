package InterfacesAssignment;

public class Square implements RegularPolygon {
    int sideLength = 10;

    Square(int length) {
        this.sideLength = length;
    }

    public int getNumSides() {
        return 4;
    }

    public int getSideLength() {
        return this.sideLength;
    }

    public static void main(String[] args) {
        Square sqObj = new Square(25);
        int sides = sqObj.getNumSides();
        int sidesLength = sqObj.getSideLength();
        System.out.println("NumSide of Square: " +sides);
        System.out.println("SideLength of Square: " +sidesLength);
        System.out.println("Total sides: "+RegularPolygon.totalSides(sides));
        System.out.println("Perimeter of Square: " +sqObj.getPerimeter(sides, sidesLength));
        System.out.println("Interior Angle: "+sqObj.getInteriorAngle(sides));
    }
}
