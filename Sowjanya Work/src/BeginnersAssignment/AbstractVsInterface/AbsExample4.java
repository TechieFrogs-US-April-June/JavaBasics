package BeginnersAssignment.AbstractVsInterface;

//Abstract class can extend only one class or one abstract class at a time
public class AbsExample4 extends AbsExample3{

    public void display3()
    {
        System.out.println("display3 method");
    }

    public static void main(String[] args) {
        AbsExample4 obj = new AbsExample4();
        obj.display3();
        obj.display1();

    }
}
