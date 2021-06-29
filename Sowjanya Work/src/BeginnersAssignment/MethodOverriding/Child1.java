package BeginnersAssignment.MethodOverriding;

public class Child1 extends Parent1{

    //Overriding method
    public void eat(){
        System.out.println("Child is eating");
    }
    public static void main( String args[]) {
        Child1 obj = new Child1();
        //This will call the child class version of eat()
        obj.eat();
    }
}
