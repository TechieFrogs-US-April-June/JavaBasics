package InterfacesAssignment;

public class EquilateralTriangle implements RegularPolygon {
    int sideLength = 5;

    EquilateralTriangle(int length) {
        this.sideLength = length;
    }

    public int getNumSides() {
        return 3;
    }

    public int getSideLength() {
        return this.sideLength;
    }

    public static void main(String[] args) {
        EquilateralTriangle etObj = new EquilateralTriangle(15);
        int sides = etObj.getNumSides();
        int sidesLength = etObj.getSideLength();
        System.out.println("NumSide of EquiTraingle: " +sides);
        System.out.println("SideLength of EquiTriangle: " +sidesLength);
        System.out.println("Total sides: "+RegularPolygon.totalSides(sides));
        System.out.println("Perimeter of EquiTriangle: " +etObj.getPerimeter(sides, sidesLength));
        System.out.println("Interior Angle: "+etObj.getInteriorAngle(sides));
    }
}
