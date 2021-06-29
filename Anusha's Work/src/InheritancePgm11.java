class Circle11{
    private double radius=1.0;
    private String color="red";
    Circle11(){
    }
    Circle11(double radius){
    }
    Circle11(double radius,String color){

    }

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
    double getarea(){
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle11{
    private double height=1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    Cylinder(){
    }
    Cylinder(double radius){
        super.setRadius(radius);
    }
    Cylinder(double radius,double height){

    }
    Cylinder(double radius,double height,String color){

    }
    double getvolume(){
        //System.out.println(super.getRadius());
        //System.out.println(getHeight());
        return Math.PI*super.getRadius()*super.getRadius()*getHeight();
    }
}



public class InheritancePgm11 {
    public static void main(String[] args) {
        Circle11 circleObj=new Circle11();
        circleObj.setRadius(2);
        System.out.println("Area:"+circleObj.getarea());
        Cylinder cylinderObj=new Cylinder(2);
        cylinderObj.setHeight(3);
        System.out.println("volume of the Cylinder is:"+cylinderObj.getvolume());
    }
}
