package BeginnersAssignment.Constructor;

public class ConstWithSuperChild extends ConstWithSuperParent {

    ConstWithSuperChild()
    {
        //compiler inserts a super(); statement at the beginning of child class constructor
        //so first super() gets executed means, parent class constructor will execute first and later child cls constructor will execute
        System.out.println("MyChildClass Constructor");
    }

    public static void main(String args[]) {
        new ConstWithSuperChild();
    }


}
