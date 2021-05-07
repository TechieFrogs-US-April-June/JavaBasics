public class Animal {
    void eat() {
        System.out.println("Eating....");
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Barking.....");
        }
    }

    static class Test {
        public static void main(String[] args) {
            Dog dogObj = new Dog();
            dogObj.eat();
            dogObj.bark();
        }
    }
}
