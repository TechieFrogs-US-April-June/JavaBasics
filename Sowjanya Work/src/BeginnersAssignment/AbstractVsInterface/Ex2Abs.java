package BeginnersAssignment.AbstractVsInterface;

public class Ex2Abs extends Ex1Abs{

    public void display1() {
        System.out.println("display1 method");
    }

    public static void main(String[] args) {
        Ex2Abs obj = new Ex2Abs();
        obj.display1();
        obj.display2();
    }
}
