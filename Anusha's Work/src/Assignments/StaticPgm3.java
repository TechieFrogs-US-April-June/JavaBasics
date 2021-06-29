package Assignments;

public class StaticPgm3 {
    static int num;
    static String mystr;
    static{
        System.out.println("Static Block 1");
        num = 1;
        mystr = "Block1";
    }
    static{
        System.out.println("Static Block 2");
        num = 2;
        mystr = "Block2";
    }
    public static void main(String args[])
    {
        System.out.println("Value of num: "+num);
        System.out.println("Value of mystr: "+mystr);
    }
}
