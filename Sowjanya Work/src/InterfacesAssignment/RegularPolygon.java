package InterfacesAssignment;

public interface RegularPolygon {
    int getNumSides();
    int getSideLength();

    static int totalSides(int sides) {
        return sides;
    }
    default int getPerimeter(int sides, int sideLength) {
        return sides * sideLength;
    }

    default int getInteriorAngle(int sides) {
        return (sides - 2)*180/sides;
    }
}
