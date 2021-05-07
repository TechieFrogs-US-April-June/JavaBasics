package ClassesandObjects;
import java.util.Scanner;

class Area1{
    int length;
    int breadth;
    public Area1(int l,int b){
        length=l;
        breadth=b;
      
    }

    public int getArea(){//
        
        return length*breadth;

}
}

 class RectangleSample2{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int l,b;

        System.out.println("Enter length");
        l=s.nextInt();
        System.out.println("Enter breadth");
        b=s.nextInt();

        Area1 a1 = new Area1(l,b);
        System.out.println("Area :"+a1.getArea());
        s.close();
    }
}

