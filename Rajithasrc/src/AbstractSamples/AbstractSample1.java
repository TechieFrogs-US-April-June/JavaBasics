package AbstractSamples;
abstract class Parent{
    abstract void display();

}
class Child1 extends Parent{
    public void display(){
        System.out.println("This is first Subclass");
    }
}
class Child2 extends Parent{
    public void display(){
        System.out.println("This is second Subclass");
    }
}


public class AbstractSample1 {
     public static void main(String[] args) {
         Child1 ch1obj = new Child1();
         ch1obj.display();
         Child2 ch2obj = new Child2();
         ch2obj.display();
     }

}
