package InheritancePack;
class Rectangle2{
    int length;
    int breadth;

    public Rectangle2(int l,int b){
        length=l;
        breadth=b;
    
    }

    public void printArea(){
        System.out.println(length*breadth);
    }
    public void printPerimeter(){
        System.out.println(2*(length+breadth));
    }
}
class Square extends Rectangle2{
    int side;
    public Square(int s){
        super(s,s);
    }

    
}
public class RectangleandSquareArea {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(5,6);
        r.printArea();
        r.printPerimeter();

        Square s= new Square(5);
        s.printArea();
        s.printPerimeter();
    }
    
}
