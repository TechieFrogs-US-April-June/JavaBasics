package src.InheritanceExercises.circleANDcylinder;

public class Circle {
    private double radius = 1.0;
    private String color ="red";
    //Costructor
     Circle(){}
     Circle(double radius){
         this.radius=radius;
     }
     Circle(double radius, String color){
         this.radius = radius;
         this.color = color;
     }
    //getters and setters method
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
   
    //Method
    public double getArea(){
        return Math.PI * this.getRadius() * this.getRadius();
    }

    public String toString(){
        return "Circle[" + "radius = " + radius+ " "+ "color= " + color + "]";
    }
    
}
