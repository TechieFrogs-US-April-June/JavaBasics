package BeginnersAssignment.Variables;

public class StaticVariable {
     public static String name = "sow";

    public static void main(String[] args) {
        StaticVariable sv = new StaticVariable();
        StaticVariable sv1 = new StaticVariable();
        StaticVariable sv2 = new StaticVariable();

        //through object reference
        System.out.println(sv.name);
        System.out.println(sv1.name);
        System.out.println(sv2.name);

        //Can also call by classname
        System.out.println(StaticVariable.name);

        sv1.name = "kanna";

        System.out.println(sv.name);
        System.out.println(sv1.name);
        System.out.println(sv2.name);

    }

}
