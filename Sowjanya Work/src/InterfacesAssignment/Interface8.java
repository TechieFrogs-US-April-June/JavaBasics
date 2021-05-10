package InterfacesAssignment;

public class Interface8 {

    public Interface7 innerClassMethod() {
        class Inter8 implements Interface7 {
            public void text() {
                System.out.println("Inside Inter8 inner class of interface8 class");
            }
            public void show() {
                System.out.println("Inside Inter8 inner class of Interface8 class");
            }
        }
        Inter8 innerClssObj = new Inter8();
        return innerClssObj;
    }

    public static void main(String[] args) {
        Interface8 clssObj = new Interface8();
        Interface7 intObj = clssObj.innerClassMethod();
        intObj.show();
        intObj.text();
    }

}
