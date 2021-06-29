interface interface1{
    void interface1method1();
    void interface1method2();
}
interface interface2{
    void interface2method1();
    void interface2method2();
}
interface interface3{
    void interface3method1();
    void interface3method2();
}
interface interface4 extends interface1,interface2,interface3{
    void interface4method1();
}
abstract class interfaceClass implements interface4{
    public void interfaceClassmethod() {
        System.out.println("Interface Class Method");
    }
}
public class InterfacePgm6 extends interfaceClass {
    public void interface1method1() {
        System.out.println("interface 1,method 1");
    }
    public void interface1method2() {
        System.out.println("interface 1,method 2");
    }
    public void interface2method1() {
        System.out.println("interface 2,method 1");
    }
    public void interface2method2() {
        System.out.println("interface 2,method 2");
    }
    public void interface3method1() {
        System.out.println("interface 3,method 1");
    }
    public void interface3method2() {
        System.out.println("interface 3,method 2");
    }
    public void interface4method1() {
        System.out.println("interface 4,method 1");
    }
    public static void main(String[] args) {
        InterfacePgm6 interfaceObj6=new InterfacePgm6();
        interfaceObj6.interface1method1();
        interfaceObj6.interface1method2();
        interfaceObj6.interface2method1();
        interfaceObj6.interface2method2();
        interfaceObj6.interface3method1();
        interfaceObj6.interface3method2();
        interfaceObj6.interface4method1();
        interfaceObj6.interfaceClassmethod();

    }
}
