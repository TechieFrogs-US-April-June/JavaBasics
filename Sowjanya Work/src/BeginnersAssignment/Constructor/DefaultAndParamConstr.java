package BeginnersAssignment.Constructor;

public class DefaultAndParamConstr {
    private int var;

    //default constructor
    public DefaultAndParamConstr()
    {
        this.var = 10;
        System.out.println("Default Constructor");
    }

    //parameterized constructor
    public DefaultAndParamConstr(int num)
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
        DefaultAndParamConstr obj = new DefaultAndParamConstr();
        DefaultAndParamConstr obj2 = new DefaultAndParamConstr(100);
        System.out.println("var is: "+obj.getValue());
        System.out.println("var is: "+obj2.getValue());
    }
}
