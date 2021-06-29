package BeginnersAssignment.MethodOverriding;

public class Child5 extends Parent5{

    public void myMethod(){
        //This will call the myMethod() of parent class
        super.myMethod();
        System.out.println("Overriding method");
    }
}
