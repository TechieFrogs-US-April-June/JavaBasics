package BeginnersAssignment.InheritanceIsARelation;

public class MultilevelChild2 extends MultilevelChild1{

    public void methodZ()
    {
        System.out.println("child2 cls method");
    }

    public static void main(String args[])
    {
        MultilevelChild2 obj = new MultilevelChild2();
        obj.methodX(); //calling grand parent class method
        obj.methodY(); //calling parent class method
        obj.methodZ(); //calling local method
    }
}
