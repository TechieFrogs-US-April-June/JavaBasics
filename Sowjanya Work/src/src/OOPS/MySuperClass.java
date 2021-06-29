package OOPS;

public class MySuperClass {
    int a = 10;
    String name;
    float b = 54.99f;

    void display() {
        System.out.println("In my supercls method " +a + " "+name +" " +b);
    }

    MySuperClass() {
        System.out.println("In mySuperCls constructor");
    }

    public static void main(String[] args) {
        MySuperClass obj = new MySuperClass();

    }
}
