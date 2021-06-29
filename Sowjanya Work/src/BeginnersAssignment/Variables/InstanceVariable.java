package BeginnersAssignment.Variables;

public class InstanceVariable {
    //Instance Variables
    String name = "sowji";

    public static void main(String[] args) {
        InstanceVariable iv = new InstanceVariable();
        InstanceVariable iv1 = new InstanceVariable();
        InstanceVariable iv2 = new InstanceVariable();

        System.out.println(iv.name);
        System.out.println(iv1.name);
        System.out.println(iv2.name);

        iv1.name = "kanna";
        System.out.println(iv.name);
        System.out.println(iv1.name);
        System.out.println(iv2.name);
    }

}
