package Constructos;

    class B {
        int a , b;
        B() {
            System.out.println(a);
            System.out.println(b);
        }
    }
    class D {
        int a , b;
        D() {
            System.out.println("Inside");
        }
        void Dis() {
            System.out.println("Inside fun");
        }

        /*public static void main(String[] args) {
            D d1 = new D();
            d1.Dis();
        }*/
    }
        public class MainCon {
            public static void main(String[] args) {
            B b1 = new B();
            D d1 = new D();
            d1.Dis();

    }
}
