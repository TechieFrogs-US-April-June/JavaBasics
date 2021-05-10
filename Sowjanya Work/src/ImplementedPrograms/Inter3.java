package ImplementedPrograms;

import InterfacesAssignment.Interface3;

public class Inter3 implements Interface3 {

    public void showMsg() {
        System.out.println("This is showMsg() method");
    }

    public void myMsg() {
        System.out.println("This is myMsg() method");
    }

    public void displayMsg() {
        System.out.println("This is displayMsg() method");
    }

    static void printMsg() {
        System.out.println("This is printMsg() method");
        Interface3.printMsg();
    }


    public static void main(String[] args) {
        Inter3 interObj = new Inter3();
        interObj.showMsg();
        interObj.myMsg();
        interObj.displayMsg();
        interObj.testMsg();
        interObj.printMsg();
        //Interface3.printMsg();

    }
}

