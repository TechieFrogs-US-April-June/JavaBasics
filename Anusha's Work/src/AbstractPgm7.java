abstract class ShapePgm7{
    protected String color;
    protected boolean filled;
    abstract void getArea();
    abstract void getPerimeter();
   public String toString(){
    System.out.println("to string");
       return null;
   }
}
class Circle7 extends ShapePgm7{
    double radius=1.0;
    void getArea(){

    }
    void getPerimeter(){

    }
    public String toString(){

        return null;
    }
}
class Rectangle7 extends ShapePgm7{
    double length=1.0;
    double breadth=1.0;
    void getArea(){

    }
    void getPerimeter(){

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public String toString(){
        System.out.println("  ");
        return null;
    }
}
class Square7 extends Rectangle7{
    public String toString(){
        System.out.println("   ");
        return null;
    }
}





public class AbstractPgm7 {
    public static void main(String[] args) {

    }
}
