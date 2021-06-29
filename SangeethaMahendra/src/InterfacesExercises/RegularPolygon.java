package src.InterfacesExercises;

public interface RegularPolygon {
    static double num =5;
    double sidelength=6;
      int getNumSides(); //by default interfave consider method as a abstract method
      double getSideLength();

      //Static method
      static double totalSlides(){
          double sumofsides=(num-2)*180 ;  //sum of the num of sides of all the elements
          return sumofsides;
          
      }

      //defualt method
      default double getPerimeter(){
        double perimeter=num*sidelength;  //getPerimeter (n * length, where n is the number of sides) 
        return perimeter;
      }

      default double getInteriorAngle(){  
        double interiorangle=((num-2)*num/num);  //getInteriorAngle ( (n-2)π/n in radians) 
        return interiorangle;

      } 
}

class EquilateralTriangle implements RegularPolygon{
     int n = 3;
     double side;
     public int getNumSides(){
        return n;
    }

     public EquilateralTriangle(double side){
        this.side=side;
    }

     public double getSideLength(){
        return side;
    }
}

class Square implements RegularPolygon{
     int s = 4;
      double side1;
    public int getNumSides(){
       return s;
   }

    public Square(double side1){
       this.side1=side1;
   }

   public  double getSideLength(){
       return side1;
   }

}

class result implements RegularPolygon {
    public static void main(String[] args) {
        result rObj = new result();
     //   rObj.getPerimeter();
       // rObj.getInteriorAngle();
      //  RegularPolygon.totalSlides(); 
        System.out.println("static total sides of interface ====> " + RegularPolygon.totalSlides());
        System.out.println("default getPerimeter of interface ====> " + rObj.getPerimeter()); 
        System.out.println("default getInteriorAngle of interface ====> " + rObj.getInteriorAngle());
        System.out.println(" getNumSides of interface ====> " + rObj.getNumSides());
        System.out.println(" getSideLength of interface ====> " + rObj.getSideLength());
        System.out.println("--------------------------------------------------- \n");
        // RegularPolygon rp = new RegularPolygon(); //Cannot instantiate the type RegularPolygon

        EquilateralTriangle et = new EquilateralTriangle(7); //gave parameter for getSideLength
        System.out.println(" getNumSides of interface ====> " + et.getNumSides());
        System.out.println(" getSideLength of interface ====> " + et.getSideLength());
      //  System.out.println(" getNumSides of interface ====> " + s.getNumSides());  //why cant scces Square in equaleateraltraingle?
        //System.out.println(" getSideLength of interface ====> " + s.getSideLength());
        System.out.println("--------------------------------------------------- \n");
   


        Square s = new Square(4); //gave parameter for getSideLength
        System.out.println(" getNumSides of interface ====> " + s.getNumSides());
        System.out.println(" getSideLength of interface ====> " + s.getSideLength());
        System.out.println(" getSideLength of interface ====> " + et.getSideLength()); //also access EquilateralTriangle
        System.out.println(" getNumSides of interface ====> " + et.getNumSides());
        


        
    }

    @Override
    public int getNumSides() {
        
        return 0;
    }

    @Override
    public double getSideLength() {
       
        return 0;
    }
}