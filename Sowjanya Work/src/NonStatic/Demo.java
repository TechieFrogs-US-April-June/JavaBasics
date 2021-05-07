package NonStatic;

public class Demo {

    static {
        Demo obj = new Demo();
        System.out.println(obj);
    }

    public static void main(String[] args) {

    }
}
