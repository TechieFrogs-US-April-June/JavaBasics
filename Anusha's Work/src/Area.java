import java.util.Scanner;

public class Area {
     int area,length,breadth;

     void setDim(int l, int b){
          length=l;
          breadth=b;
    }
      int  getArea(){
        area=length*breadth;
         System.out.println("Area of Rectangle:"+area);
         return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and Breadth:");
        int l= sc.nextInt();
        int b= sc.nextInt();
        Area a1=new Area();
         a1.setDim(l,b);
         a1.getArea();

    }
}
