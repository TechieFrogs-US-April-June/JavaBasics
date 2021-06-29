package BeginnersAssignment.Static;

public class StaticMetInStaticAndNonStatic {
    static int i = 100;
    static String s = "Java";

    //Static method
    static void display()
    {
        System.out.println("i:"+i);
        System.out.println("i:"+s);
    }

    //non-static method
    void funcn()
    {
        //Static method called in non-static method
        display();
    }

    //static method
    public static void main(String args[])
    {
        StaticMetInStaticAndNonStatic obj = new StaticMetInStaticAndNonStatic();
        //You need to have object to call this non-static method
        obj.funcn();

        //Static method called in another static method(no need any object to call static method inside another static method)
        display();
    }
}
