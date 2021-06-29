package BeginnersAssignment.Abstract;

public class Child1 extends Parent1{

    public void disp2()
    {
        System.out.println("overriding abstract method");
    }

    public static void main(String[] args) {

        Child1 obj = new Child1();
        obj.disp2();

    }
}
