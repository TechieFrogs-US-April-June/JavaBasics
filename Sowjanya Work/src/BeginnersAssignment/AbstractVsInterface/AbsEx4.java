package BeginnersAssignment.AbstractVsInterface;

//Abstract class can be extended(inherited) by a class or an abstract class
public class AbsEx4 extends AbsEx3{
    public void display2(){
        System.out.println("Example4-display2 method");
    }
    public void display3(){
        System.out.println("display3 method");
    }

    public static void main(String[] args) {
        AbsEx4 obj = new AbsEx4();
        obj.display2();
        obj.display3();
    }
}
