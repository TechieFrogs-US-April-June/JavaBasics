package InterfacesAssignment;

public interface Interface3 {
    int num = 10;

    void showMsg();
    void myMsg();
    void displayMsg();
    static void printMsg() {
        System.out.println("This is static method");
    }

    default void testMsg() {
        System.out.println("This is default method");
    }

}
