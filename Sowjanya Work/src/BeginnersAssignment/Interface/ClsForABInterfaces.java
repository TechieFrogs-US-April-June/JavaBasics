package BeginnersAssignment.Interface;

public class ClsForABInterfaces implements AInterface,BInterface{

    public void aaa()
    {
        System.out.println("hjtfsdg");
    }

    public static void main(String[] args) {
        ClsForABInterfaces obj = new ClsForABInterfaces();
        obj.aaa();
    }
}
