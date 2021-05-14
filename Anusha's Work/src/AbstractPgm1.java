abstract class Parent1{
    abstract void message();
}
class Child1 extends Parent1{
    void message(){
        System.out.println("This is first sub class");
    }
}
class Child2 extends Parent1{
    void message(){
        System.out.println("This is Second sub class");
    }
}
public class AbstractPgm1{
    public static void main(String[] args) {
        Child1 childObj1=new Child1();
        childObj1.message();
        Child2 childObj2=new Child2();
        childObj2.message();

    }
}
