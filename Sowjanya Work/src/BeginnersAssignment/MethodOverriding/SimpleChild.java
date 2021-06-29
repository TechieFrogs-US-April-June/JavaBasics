package BeginnersAssignment.MethodOverriding;

public class SimpleChild extends SimpleParent{

    public int speedLimit()
    {
        return 150;
    }

    public static void main(String[] args) {
        SimpleParent obj = new SimpleChild();
        int num= obj.speedLimit();
        System.out.println("Speed Limit is: "+num);
    }
}
