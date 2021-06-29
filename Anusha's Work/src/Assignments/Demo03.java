package Assignments;

class Human{
    public void walk()
    {
        System.out.println("Human walks");
    }
}
class Demo03 extends Human{

    public void walk(){
        System.out.println("Boy walks");
    }
    public static void main( String args[]) {
        Human obj = new Demo03();
        Human obj2 = new Human();
        obj.walk();
        obj2.walk();
    }
}
