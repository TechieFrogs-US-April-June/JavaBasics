package src.InheritanceExercises.circleANDcylinder;

public class TestCylinder {
public static void main(String[] args) {
         Cylinder cylObj = new Cylinder(2.6, 7, "red");
        System.out.println("Volume of cylinder: "+cylObj.getVolume());
        System.out.println("Area of circle: "+cylObj.getArea());
        Circle cirObj = new Circle(4);
        System.out.println(cylObj);
        System.out.println(cirObj);
    

    
}    
}
