package Assignments;

public class StaticPgm2 {
    static int num;
    static String name;
    static{
        num = 10;
        name = "Static keyword in Java";
    }
    public static void main(String args[])
    {
        System.out.println("Value of num: "+num);
        System.out.println("Value of mystr: "+name);
    }
}
