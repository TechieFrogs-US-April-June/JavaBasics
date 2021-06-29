package BeginnersAssignment.Abstract;

public class ChildDemo extends ParentAbstractDemo{

    public void anotherMethod() {
        System.out.print("Abstract method");
    }

    public static void main(String[] args) {

        //error: You can't create object of abstract class
       /* ParentAbstractDemo obj = new ParentAbstractDemo();
        obj.anotherMethod();*/
    }
}
