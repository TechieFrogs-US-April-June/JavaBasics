package BeginnersAssignment.AbstractVsInterface;

//Interfaces can be extended only by interfaces. Classes has to implement interfaces instead of extends

public class Interface3 implements Interface2{

    public void display1() {
        System.out.println("display1 method");
    }

    public static void main(String[] args) {
        Interface3 obj = new Interface3();
        obj.display1();
    }

}
