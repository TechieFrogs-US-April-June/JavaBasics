package src.InterfacesExercises;

public interface RegularPolygon {
    
      int getNumSides(); //by default interfave consider method as a abstract method
      double getSideLength();
}

class EquilateralTriangle {
     int n = 3;
     double side;
     int getNumSides(){
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
   public int s = 4;
    public double side1;
    public int getNumSides(){
       return s;
   }

    public Square(double side){
       this.side1=side1;
   }

   public  double getSideLength(){
       return side1;
   }

}
