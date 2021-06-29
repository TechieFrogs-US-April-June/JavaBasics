package BeginnersAssignment.RecheckPackage;//same package

//imported this package from another package
import BeginnersAssignment.Packages.CalculatePkg;

public class Demo {

    public static void main(String[] args) {

        //created object for the imported class from other package
        CalculatePkg obj = new CalculatePkg();
        System.out.println(obj.add(200,500));
    }
}
