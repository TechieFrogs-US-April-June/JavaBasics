package Inheritance;

    public class Counter {
        private int i;

        void increment(int x) {
            this.i = x;
            System.out.println("i = " +i);

        }
    }

class Subclass extends Counter {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.increment(3);
    }
}
