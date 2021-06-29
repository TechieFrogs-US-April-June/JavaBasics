package ImplementedPrograms;

import InterfacesAssignment.Interface7;

public class Inter7 {
    protected class Face7 implements Interface7 {

        public Face7() {
            System.out.println("Inside inner class constructor");
        }

        public void text() {
            System.out.println("This is text method");
        }
        public void show() {
            System.out.println("This is show method");
        }
    }

   /* public static void main(String[] args) {
        Inter7 Obj = new Inter7();
        Inter7.Face7 ifObj = Obj.new Face7();
        ifObj.show();
        ifObj.text();
    }*/
}
