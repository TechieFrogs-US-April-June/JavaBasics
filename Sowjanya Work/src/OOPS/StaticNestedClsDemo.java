package OOPS;

class Outercls{
    static int x = 10;
    int y = 20;
    private static int z = 30;

    static class StaticNestedCls {
       void display() {
            System.out.println("x= " +x);
            //System.out.println("y= " +y); // This statement will give compilation error as static nested class cannot directly access non-static members
            System.out.println("z= " +z);
        }
    }
}

public class StaticNestedClsDemo { //Driver class

    public static void main(String[] args) { //main method
        Outercls.StaticNestedCls nestedObject = new Outercls.StaticNestedCls(); //Accessing a StaticNestedCls
        nestedObject.display();
    }
}
