package AbstractSamples;
abstract class Demo1{
    Demo1(){
        System.out.println("This is Constructor of abstract Class");
    }

    abstract void a_Method();

    void display(){
        System.out.println("This is a normal method of abstract class");
    }
}
class SubClass extends Demo1{
    @Override
    void a_Method() {
        System.out.println("This is abstract method");
    }
}
public class AbstractSample4 {
    public static void main(String[] args) {
        SubClass subobj = new SubClass();
        subobj.a_Method();
        subobj.display();

    }
    
}
