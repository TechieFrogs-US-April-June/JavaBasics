class calculate{
    void area(int l,int b){
        int length,breadth,area;
        length=l;
        breadth=b;
        area=l*b;
        System.out.println("Area of a Rectangle :"+area);
    }
    void area(int s){
        int s1,area;
        s1=s;
        area=s1*s1;
        System.out.println("Area of a Square:"+area);
    }
}
public class MethodPgm3 {
    public static void main(String[] args) {
        calculate calObj=new calculate();
        calObj.area(12);
        calObj.area(10,5);

    }
}
