package BeginnersAssignment.Final;

public class ChildFinalClass { //extends ParentFinalClass {

    //cannot inherit from final class(parent final class)
    void demo(){
        System.out.println("My Method");
    }

    public static void main(String[] args) {
        Child1FinalMethod obj = new Child1FinalMethod();
        obj.demo();
    }

}
