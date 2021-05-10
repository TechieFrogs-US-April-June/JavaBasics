package SirishaWork.src.Inheritance;

    public class A {
        private int i;
        private int j;

        A() {
        }

        A(int i, int j) {
            this.i = i;
            this.j = j;
        }
        void show() {
            System.out.println("i value: "+i+ "\nj value: " +j);
        }
    }

class B extends A {
    private int k;
    B() {
    }
    B(int k) {
        this.k = k;
    }
    //overriding show() method
    void show() {
        System.out.println("k value: "+k);
    }

    public static void main(String[] args) {
        A obj1 = new A(3, 4);
        B obj = new B(6);
        obj1.show();
        obj.show();



    }
}
