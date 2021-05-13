package src.InheritanceExercises.Shape;

//Parent class for Rectangle and Circle
public class Shape {

     void shapeDisplay(){
         System.out.println("This is shape");

     }
    public static void main(String[] args) {
        Shape shapeObj = new Shape();
        shapeObj.shapeDisplay();
        
    }
    
}
