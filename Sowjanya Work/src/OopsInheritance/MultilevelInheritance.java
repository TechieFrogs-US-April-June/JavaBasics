package OopsInheritance;

class Student {
    void fun1() {
        System.out.println("studying");
    }
}

class Graduate extends Student {
    void fun2() {
        System.out.println("masters");
    }
}

class UnderGraduate extends Graduate {
    void fun3() {
        System.out.println("bachelors");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        UnderGraduate ugObg = new UnderGraduate();
        ugObg.fun3();
        ugObg.fun2();
        ugObg.fun1();
    }

}
