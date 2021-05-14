package InterfaceSamples;

interface RegularPolygon{
    int getNumSides();
    double getSideLength();
    
    static void totalSidesMethod(){
      System.out.println("static total sides method of interface");
    }
    default void getPerimeter(){
      System.out.println("default getPerimeter method of interface ");
    }
    default void getInteriorAngle(){
      System.out.println("default getInteriorAngle method of interface");
    }
}

class EquilateralTriangle implements RegularPolygon{
    private static int numberOfETSides=3;
    private double side;

    public EquilateralTriangle(double side){
        this.side=side;
    }
    public int getNumSides(){
        return numberOfETSides;
    }
    public double getSideLength(){
        return side;
    }
}

class Square implements RegularPolygon{
    private static int numberOfSqSides=4;
    private double side1;

public Square(double side1){
    this.side1=side1;

}
public int getNumSides(){
  return numberOfSqSides;
}
public double getSideLength(){
    return side1;
}
}

class Solution implements RegularPolygon{

    static double n=3;
    double sidelength=5;
    static double sumofsides=(n-2)*180 ;

        double perimeter=n*sidelength;

        double interiorangle=((n-2)*n/n);

    static void totalSidesMethod(){
        System.out.println("sum of sides of polygon is : "+sumofsides);
    }

     
    public void getPerimeter() {
        System.out.println("Perimeter of polygon is : "+perimeter);
        
        RegularPolygon.super.getPerimeter();
    }

    public void getInteriorAngle(){
        System.out.println("Interior Angle of polygon is :"+interiorangle+"radians");

    }


    @Override
    public int getNumSides() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getSideLength() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
public class interfaceSample4 extends Solution{

    public static void main(String[] args) {
        EquilateralTriangle etobj = new EquilateralTriangle(8);
        System.out.println("Number of sides of Equilateral Triangle are : "+etobj.getNumSides());
        System.out.println("Side Length of Equilateral Triangle is : "+etobj.getSideLength());
        Square sqobj = new Square(6);
        System.out.println("Number of Sides of Square are : "+sqobj.getNumSides());
        System.out.println("Side Length of Square is : "+sqobj.getSideLength());



        Solution sobj = new Solution();
        Solution.totalSidesMethod();
        sobj.getPerimeter();
        sobj.getInteriorAngle();


    }

  
    
}
