package BeginnersAssignment.InheritanceIsARelation;

public class SingleChild extends SingleParent{

    public void methodB()
    {
        System.out.println("Child class method");
    }

    public static void main(String args[])
    {
        SingleChild obj = new SingleChild();
        obj.methodA(); //calling super class method
        obj.methodB(); //calling local method
    }
}
