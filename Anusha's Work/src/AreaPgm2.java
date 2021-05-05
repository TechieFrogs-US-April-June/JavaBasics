import java.util.Scanner;

public class AreaPgm2 {
    int length,breadth,area;

    AreaPgm2(int l, int b) {
        length=l;
        breadth=b;
    }

     void returnArea() {
        area=length*breadth;
         System.out.println("In returnArea Method");
        System.out.println("Area of Rectangle:"+area);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and Breadth:");
        int l= sc.nextInt();
        int b= sc.nextInt();
        AreaPgm2 a1=new AreaPgm2(l,b);
        a1.returnArea();

    }
}
