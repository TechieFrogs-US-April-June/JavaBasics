package src.AbstractExercises;
//Still working on this
abstract public class Shape1 {

    protected String color ="Red";
    protected Boolean filled = true;
    Shape1(){}
    Shape1(String color, boolean filled){}
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean isFilled() {
        return filled;
    }
    public void isFilled(Boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString() {
        System.out.println("Shape1[color = " + color +" " + "filled = " + filled + "]");
        return super.toString();
    }
}

class Circle extends Shape1{
    double radius =1.0;
    Circle(){}
    Circle(double radius){}
    Circle(double radius , String color , boolean filled){}
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea(){
        return radius;
    }
    double getPerimeter(){
          return radius;
    }
    @Override
    public String toString() {
        System.out.println("Circle[color = " + color + " " + "filled = " + filled + " "+ "radius" + radius + "]");
        return super.toString();
    }
}

class Rectangle extends Shape1{
    double width =1.0 , length =1.0;
    Rectangle(){}
    Rectangle(double width , double length){}
    Rectangle(double width , double length, String color , boolean filled ){}
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    double getArea(){
        return length*width;
    }
    double getPerimeter(){
    return getPerimeter();
    }
    @Override
    public String toString() {
        System.out.println("Rectangle[Shape[color = " + color + " " + "filled = " + filled + "]" + " "+ "length = " + length + " " + "width = "+ width + "]");
        return super.toString();
    }
}

class Square extends Rectangle{
    double side;
    Square(){}
    Square(double side){}
    Square(double side, String color , boolean filled ){}
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = side;
    }
   public void setLength(double side) {
         this.side = side;
    }
    @Override
    public String toString() {
        System.out.println("Square[Rectangle[color = " + color + " " + "filled = " + filled + "]" + " "+ "length = " + length + " " + "width = "+ width + "]");
        return super.toString();
    }
}

class Test{
    public static void main(String[] args) {
        Circle cObj = new Circle();
        //cObj.getColor();
      //  cObj.setColor("Blue");
        //cObj.isFilled();
        //cObj.isFilled(false);
     System.out.println("Area of Rectangle"+ cObj.getArea());
     System.out.println("Perimeter of Rectangle"+ cObj.getPerimeter());
       cObj.getRadius();
       cObj.toString();

    // Rectangle rObj = new Rectangle();
    // rObj.getLength();
    // rObj.getWidth();
    // System.out.println("Area of rRectangle"+ rObj.getArea());
    // System.out.println("Area of rRectangle"+ rObj.getPerimeter());
    //  //cObj.toString();

    }
}