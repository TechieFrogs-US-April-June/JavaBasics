package src.InheritanceExercises.ParentChild;

public class childClass extends parentClass{

    void display1(){
        System.out.println("This is Child class");
    }
    
    public static void main(String[] args) {
        childClass childObj = new childClass();
        childObj.display1();
       // childObj.display(); //this is not accessible because it is a private variable from Parent class
    }
}
