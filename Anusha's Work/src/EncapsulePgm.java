class A1{
     int a2=10;
    String s2="Inheritance";
    }
class B1 extends A1 {
    int a2 = 20;
    String s2 = "Example";

    void display() {
        System.out.println(" Value from child class is"+this.a2 + " " + " "+"value from Parent class is"+super.a2);
        System.out.println( super.s2 + " " +this.s2);
    }
}

public class EncapsulePgm {

    public static void main(String[] args) {
        B1 b1Obj=new B1();
        System.out.println(b1Obj.a2);
        b1Obj.display();

    }
}
