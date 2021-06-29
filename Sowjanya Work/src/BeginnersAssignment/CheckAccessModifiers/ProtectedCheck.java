package BeginnersAssignment.CheckAccessModifiers;

import BeginnersAssignment.AccessModifiers.ProtectedAccess;

//Can access protected access modifier in subclass of other package

public class ProtectedCheck extends ProtectedAccess {

    public static void main(String[] args) {

        ProtectedCheck obj = new ProtectedCheck();

        System.out.println(obj.addTwoNumbers(50,100));

    }



}
