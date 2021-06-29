package BeginnersAssignment.Variables;

public class LocalVariable {
    String name = "sowjanya";

    public void disp()
    {
        //Local Variables
        String name = "Inside Method";
        System.out.println(name);
    }

    public static void main(String[] args) {
        LocalVariable lv = new LocalVariable();

        System.out.println("calling method");
        lv.disp();
        System.out.println(lv.name);
    }
}
