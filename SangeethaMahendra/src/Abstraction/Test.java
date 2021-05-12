package src.Abstraction;

public class Test extends Shape {

    Test(){
        System.out.println("Test class Constructor");
    }
    public static void main(String[] args) {

        //can not create obj of Shape 
       // Shape s = new Shape();

    //    Shape s = new Test();
    //    s.drawing();
    //    s.fill();

    Test test = new Test();
        
    }

    @Override
    void drawing() {
       System.out.println("Test.....drawing");
        
    }

   
}
