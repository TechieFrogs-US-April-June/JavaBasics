package BeginnersAssignment.Constructor;

public class ThisParamConstructor {
    private int var;

    //default constructor
    public ThisParamConstructor()
    {
        this.var = 10;
    }

    //parameterized constructor
    public ThisParamConstructor(int num)
    {
        this.var = num;
    }
    //Method
    public int getValue()
    {
        return var;
    }

    public static void main(String args[])
    {
        ThisParamConstructor obj = new ThisParamConstructor();
        ThisParamConstructor obj2 = new ThisParamConstructor(100);
        System.out.println("var is: "+obj.getValue());
        System.out.println("var is: "+obj2.getValue());
    }
}
