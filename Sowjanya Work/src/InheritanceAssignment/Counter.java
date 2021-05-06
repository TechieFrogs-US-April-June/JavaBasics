package InheritanceAssignment;

public class Counter {
    int i;

    void increment(int x) {
        i = x;
        System.out.println("i = " +i);

    }
}
class SubClass extends Counter {

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.increment(3);
    }



}