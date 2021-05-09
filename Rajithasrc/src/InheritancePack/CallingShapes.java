package InheritancePack;

class Shape{
    public void printMethod(){
        System.out.println("This is Shape");
    }
}
class Rectangle extends Shape{
    public void printRectangle(){
        System.out.println("This is Rectangular Shape");
    }
}
class Circle extends Shape{
    public void printCircle(){
        System.out.println("This is Circular Shape");
    }
}
class Square extends Rectangle{
    public void method(){
        System.out.println("Square is Rectangle");
    }
}
public class CallingShapes {
    public static void main(String[] args) {
        Square s= new Square();
        s.printRectangle();
        s.printMethod();
    }
    
}
