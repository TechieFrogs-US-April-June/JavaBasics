package src.InheritanceExercises.Rectangle;

public class Square extends Rectangle{

    
    public Square(int len, int bre) {
        super(len, bre);
    }

    public static void main(String[] args) {
        Square s = new Square(9,1007);
        s.area();
        s.perimeter();
    
        
        
    }
    
}
