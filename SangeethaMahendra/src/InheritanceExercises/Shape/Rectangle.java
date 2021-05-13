package src.InheritanceExercises.Shape;

//Child class of Shape 
//Parent class of Square
public class Rectangle extends Shape {

    void recDisplay(){
        System.out.println("This is rectangular shape");
    }
    public static void main(String[] args) {
        Rectangle recObj = new Rectangle();
        recObj.recDisplay();
        
    }
    
}
