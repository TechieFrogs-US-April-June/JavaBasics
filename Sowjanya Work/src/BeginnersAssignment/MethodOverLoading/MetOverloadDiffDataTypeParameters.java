package BeginnersAssignment.MethodOverLoading;

public class MetOverloadDiffDataTypeParameters {

    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
        System.out.println(c );
    }

    public static void main(String[] args) {
        MetOverloadDiffDataTypeParameters obj = new MetOverloadDiffDataTypeParameters();
        obj.disp('a');
        obj.disp(100);
    }
}
