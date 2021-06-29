package BeginnersAssignment.InheritanceIsARelation;

public class HierarchicalChild3 extends HierarchicalParent {

    public void methodD()
    {
        System.out.println("method of HierarchicalChild3");
    }

    public static void main(String args[])
    {
        HierarchicalChild1 obj1 = new HierarchicalChild1();
        HierarchicalChild2 obj2 = new HierarchicalChild2();
        HierarchicalChild3 obj3 = new HierarchicalChild3();

        //All classes can access the method of HierarchicalParent
        obj1.methodA();
        obj2.methodA();
        obj3.methodA();
    }
}
