package SirishaWork.src.MethodAssignment;

public class OverLoading
{
    public void display(char c, int n)
    {
        System.out.println("First method display");
    }
    public void display(int n, char c)
    {
        System.out.println("sum is "+ (c+n));

    }
}
class Overload1
{
    public static void main(String args[])
    {
        OverLoading obj = new OverLoading();
        obj.display('x', 44 );
        obj.display(42, 'y');
    }
}
