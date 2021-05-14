package PolymorphismAssignment;

class IClass {
    public int i;
    public void printNum() {
        System.out.println("I value: "+i);
    }
}

class JClass extends IClass {
    public int j;
    public void printNum() {
        super.printNum();
        System.out.println("J value: "+j);
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        JClass jObj = new JClass();
        jObj.i = 10;
        jObj.j = 20;
        jObj.printNum();
    }
}
