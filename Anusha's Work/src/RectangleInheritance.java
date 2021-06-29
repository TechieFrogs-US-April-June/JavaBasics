class RectanglePgm{
    int length,breadth,area,perimeter;
    public RectanglePgm(int l, int b) {
        length=l;
        breadth=b;
    }

    public void area(){
        area=length*breadth;
        System.out.println("Area of Rectangle:"+area);
    }
    public void perimeter(){
        perimeter=2*(length+breadth);
        System.out.println("Perimeter of Rectangle:"+perimeter);
    }

}
class Square1 extends RectanglePgm{
    public Square1(int s) {
        super(s,s);

    }
}
public class RectangleInheritance {
    public static void main(String[] args) {
        RectanglePgm rectangleObj=new RectanglePgm(10,10);
        rectangleObj.area();
        rectangleObj.perimeter();
        System.out.println("---------------------------------------");
        Square1 squObj=new Square1(10);
        squObj.area();
        squObj.perimeter();



    }
}
