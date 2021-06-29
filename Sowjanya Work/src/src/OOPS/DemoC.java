package OOPS;

    class DemoA {
        int i = 0;

        void functionA() {
            System.out.println("Inside funA() of class DemoA");
        }
    }
    class DemoB {
        int j = 0;

        void functionB() {
            System.out.println("Inside funB() of class DemoB");
        }
    }
        public class DemoC {
            void functionC() {
                System.out.println("Inside func() of class DemoC");
            }

            public static void main(String[] args) {
                DemoA da = new DemoA();
                DemoB db = new DemoB();
                da.functionA();
                db.functionB();
            }
    }
