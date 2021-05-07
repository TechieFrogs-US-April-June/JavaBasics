package InheritanceAssignment;

public class Counter {
    private int i;

    void increment(int x) {
        this.i = x;
        System.out.println("i = " +i);

    }
}
class SubClass extends Counter {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.increment(3);
    }
}