package BeginnersAssignment.Binding;

public class StaticBindingBoy1 extends StaticBindingHuman1 {

    /*The binding of static, private and final methods is compile-time.
     The reason is that these methods cannot be overridden and
     the type of the class is determined at the compile time.
     */

    public static void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String[] args) {

        StaticBindingHuman1 obj = new StaticBindingBoy1();
        StaticBindingHuman1 obj1 = new StaticBindingHuman1();

        obj.walk();
        obj1.walk();

    }



}
