package BeginnersAssignment.Binding;

public class DynamicBindingChild1 extends DynamicBindingParent1 {

    //Overriding Method
    public void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String[] args) {
        DynamicBindingParent1 obj = new DynamicBindingChild1();
        DynamicBindingParent1 obj1 = new DynamicBindingParent1();

        obj.walk();
        obj1.walk();
    }
}
