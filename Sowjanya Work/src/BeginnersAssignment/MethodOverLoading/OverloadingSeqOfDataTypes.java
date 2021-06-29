package BeginnersAssignment.MethodOverLoading;

public class OverloadingSeqOfDataTypes {

    public void disp(char c, int num)
    {
        System.out.println("I’m the first definition of method disp");
    }
    public void disp(int num, char c)
    {
        System.out.println("I’m the second definition of method disp" );
    }

    public static void main(String[] args) {
        OverloadingSeqOfDataTypes obj = new OverloadingSeqOfDataTypes();
        obj.disp('a',50);
        obj.disp(100,'h');
    }
}
