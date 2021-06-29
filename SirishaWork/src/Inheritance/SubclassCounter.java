package SirishaWork.src.Inheritance;

    class Counter {
        private int i;

        void increment(int x) {
            this.i = x;
            System.out.println("i = " +i);

        }
    }
    public class SubclassCounter extends Counter {
        public static void main(String[] args) {
            SubclassCounter sub = new SubclassCounter();
            sub.increment(3);
        }
    }
