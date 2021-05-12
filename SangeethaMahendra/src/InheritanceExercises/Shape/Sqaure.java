package src.InheritanceExercises.Shape;

//child class of Rectangle
public class Sqaure extends Rectangle {

    void squareDisplay(){
        System.out.println("Square is a rectangle");
    }
    public static void main(String[] args) {

        Sqaure squareObj = new Sqaure();
       // squareObj.squareDisplay();
        squareObj.shapeDisplay();
        squareObj.recDisplay();

        
    }
    
}
