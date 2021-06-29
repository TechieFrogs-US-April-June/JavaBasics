package BeginnersAssignment.MethodOverLoading;

public class DisplayOverLoading {

    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(char c, int num)
    {
        System.out.println(c + " "+num);
    }

    public static void main(String[] args) {

        DisplayOverLoading obj = new DisplayOverLoading();
        obj.disp('a');
        obj.disp('a',10);
    }
}
