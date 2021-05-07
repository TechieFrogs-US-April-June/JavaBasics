package OOPS;

public class MultiLevelInherit {

    void fun1() {
        System.out.println("Inside func1() of class MultiLevelInherit");
    }

}

class level1 extends MultiLevelInherit {

    void fun1() {
        System.out.println("Inside fun1() of class level1");
        super.fun1();
    }
}

class level2 extends level1 {

    void fun1() {
        System.out.println("Inside fun1() of class level2");
        super.fun1();
    }

    public static void main(String[] args) {
        level2 obj = new level2();
        obj.fun1();
    }
}
