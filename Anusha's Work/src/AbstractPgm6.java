abstract class Shape2{
    abstract void RectangleArea(int l,int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
}
class Area1 extends Shape2{
    int length,breadth,side,radius;
    void RectangleArea(int l,int b){
        this.length=l;
        this.breadth=b;
        int areaofrectangle=l*b;
        System.out.println("Area Of a Rectangle:"+areaofrectangle);
    }
    void SquareArea(int s){
        this.side=s;
        int areaofsquare=s*s;
        System.out.println("Area of a square:"+areaofsquare);
    }
    void CircleArea(int r){
        this.radius=r;
        double areaofcircle=3.14*r*r;
        System.out.println("Area of a Circle:"+areaofcircle);
    }
}
public class AbstractPgm6 {
    public static void main(String[] args) {
        Area1 area1Obj=new Area1();
        area1Obj.RectangleArea(2,5);
        area1Obj.SquareArea(5);
        area1Obj.CircleArea(3);

    }
}
