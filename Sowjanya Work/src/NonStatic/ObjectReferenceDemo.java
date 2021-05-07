package NonStatic;

public class ObjectReferenceDemo {
    int num;

    ObjectReferenceDemo() {

    }

    public static void main(String[] args) {
        ObjectReferenceDemo ord = new ObjectReferenceDemo();
        System.out.println(ord.num);
    }
}
