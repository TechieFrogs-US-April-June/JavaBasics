package AbstractAssignment;

abstract class NewParent {

    NewParent() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();
    void showMsg() {
        System.out.println("This is normal method of abstract class");
    }
}

class NewChild extends NewParent {

    public void a_method() {
        System.out.println("This is abstract method");
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        NewChild ncObj = new NewChild();
        ncObj.a_method();
        ncObj.showMsg();
    }
}
