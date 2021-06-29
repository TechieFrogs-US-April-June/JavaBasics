package InterfacesAssignment;

public class IntClass4 implements Interface3 {

    public void showMsg() {
        System.out.println("this is class showmessage");
    }

    public void myMsg() {
        System.out.println("this is class mymsg");
    }

    public void displayMsg() {
        System.out.println("this is class displaymsg");
    }

    public static void main(String[] args) {
        IntClass4 clsObj = new IntClass4();
        //clsObj.printMsg();
        //clsObj.num = 5;
    }
}
