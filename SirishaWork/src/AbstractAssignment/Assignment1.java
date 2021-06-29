package SirishaWork.src.AbstractAssignment;

    abstract class Parent {
            abstract void message();
    }
    class Child extends Parent {
            void message(){
                System.out.println("This is First subclass");
            }
    }
    class Child1 extends Parent {
            void message(){
                System.out.println("This is Second subclass");
            }
    }
    public class Assignment1 {

        public static void main(String[] args) {
            Child cObj = new Child();
            cObj.message();

            Child1 cObj1 = new Child1();
            cObj1.message();
        }
    }
