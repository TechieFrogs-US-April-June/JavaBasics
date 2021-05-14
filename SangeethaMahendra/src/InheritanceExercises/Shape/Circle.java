package src.InheritanceExercises.Shape;

public class Circle extends Shape {

    void CircleDisplay(){
        System.out.println("This is Circular shape");
    }

    public static void main(String[] args) {
        Circle cirObj = new Circle();
        cirObj.CircleDisplay();
    }
    
}
