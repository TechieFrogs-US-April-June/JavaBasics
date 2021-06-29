package BeginnersAssignment.Final;

public class Child1FinalMethod extends Parent1FinalMethod {

    //A final method cannot be overridden.
    // Which means even though a sub class can call the final method
    // of parent class without any issues but it cannot override it.
       /* void demo(){
        System.out.println("child1 Class Method");
    }*/

    public static void main(String[] args) {
        Child1FinalMethod obj = new Child1FinalMethod();
        obj.demo();
    }
}
