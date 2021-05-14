package InterfaceSamples.pack2;
import InterfaceSamples.pack1.Student;

class Test1 implements Student {
    @Override
    public void rollNo() {
        System.out.println("18CS35");
    }

    @Override
    public void course() {
        System.out.println("OOP");
    }

    @Override
    public void marks() {
        System.out.println("85");
    }
}



public class MyTest {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.rollNo();
        t.course();
        t.marks();
    }
    
}
