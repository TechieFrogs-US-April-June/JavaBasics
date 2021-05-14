package InheritancePack;
 class Circle1 {  
   private double radius;
   private String color;

   public Circle1() {  
    radius = 1.0;
    color = "red";
 }

 public Circle1(double r) {  
    radius = r;
    color = "red";
 }

 public double getRadius() {
    return radius; 
  }

  public double getArea() {
    return radius*radius*Math.PI;
 }
}

class Cylinder extends Circle1 {  
   private double height;

   public Cylinder() {
    super();        
    height = 1.0; 
 }

 public Cylinder(double height) {
    super();       
    this.height = height;
 }

 public Cylinder(double radius, double height) {
    super(radius);  
    this.height = height;
 }
 
 public double getHeight() {
    return height; 
 }

 public double getVolume() {
    return getArea()*height; 
 }
}


public class TestCylinder {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
      System.out.println("Cylinder:" + " radius=" + c1.getRadius()  + " height=" + c1.getHeight() + " base area=" + c1.getArea() + " volume=" + c1.getVolume());
        
      Cylinder c2 = new Cylinder(10.0);
      System.out.println("Cylinder:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " base area=" + c2.getArea()
            + " volume=" + c2.getVolume());

            Cylinder c3 = new Cylinder(2.0, 10.0);
            System.out.println("Cylinder:"
                  + " radius=" + c3.getRadius()
                  + " height=" + c3.getHeight()
                  + " base area=" + c3.getArea()
                  + " volume=" + c3.getVolume());
    }
    
}
