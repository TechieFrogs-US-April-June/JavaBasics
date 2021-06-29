package Assignments;

class ABCD{
    public void myMethod()
    {
        System.out.println("Overridden method");
    }
}
class OverriddedPgm1 extends ABCD{
    public void myMethod(){
        super.myMethod();
        System.out.println("Overriding method");
    }
    public static void main( String args[]) {
        OverriddedPgm1 obj = new OverriddedPgm1();
        obj.myMethod();
    }
}
