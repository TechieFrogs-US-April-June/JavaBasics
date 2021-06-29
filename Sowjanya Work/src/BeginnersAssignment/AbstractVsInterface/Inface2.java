package BeginnersAssignment.AbstractVsInterface;

public class Inface2 implements Inface1{
    public void display1() {
        System.out.println("display1 method");
    }

    public static void main(String[] args) {
        Inface2 obj = new Inface2();
        obj.display1();
    }
}
