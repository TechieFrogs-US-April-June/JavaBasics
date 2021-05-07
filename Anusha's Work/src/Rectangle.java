public class Rectangle {
    int l,b,area;
    void area() {
         area= l*b;
        System.out.println("Area of Rectangle is:" + area);
    }
    Rectangle(int length,int breadth){
        l=length;
        b=breadth;
    }
    public static void main(String[] args) {
        Rectangle rectangleObj1=new Rectangle(4,5);
        rectangleObj1.area();


        Rectangle rectangleObj2=new Rectangle(5,8);
        rectangleObj2.area();

    }
}
