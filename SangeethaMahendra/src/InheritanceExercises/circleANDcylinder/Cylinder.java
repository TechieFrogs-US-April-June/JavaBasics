package src.InheritanceExercises.circleANDcylinder;

public class Cylinder extends Circle {
private double height = 1.0;

//constructor over loading
Cylinder(){}
Cylinder(double radius){
    super(radius);
}
Cylinder(double radius, double height){
    super(radius);
    this.height = height;
}
Cylinder(double radius, double height, String color ){
    super(radius, color);
    this.height=height;
}

//getters and setters
public double getHeight() {
    return height;
}
public void setHeight(double height) {
    this.height = height;
}

public double getVolume(){
    return getArea() * this.height;
    
}

//Method Overriding
public double getArea(){
    return Math.PI * super.getRadius() * super.getRadius();
}
}
