package src.MethodExercises;

//Q3 ; Area of Square and Rectangle
class AreaRec{
protected int display(int l, int b){
      return l*b;
        
    }

  protected int display(int side){
        return side*side;
    }
}

public class Area {
    public static void main(String[] args) {
      AreaRec obj = new AreaRec();
      System.out.println("Area of a Rectangle : " + obj.display(8, 3));
      System.out.println("Area of a Square : " + obj.display(5));
        
    }
    
}
