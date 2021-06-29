package CheckingForBeginnersPkg;

public class FulNameForimportCls {

    public static void main(String[] args) {

        //Using fully qualified name instead of import the package
        BeginnersAssignment.Packages.CalculatePkg obj = new BeginnersAssignment.Packages.CalculatePkg();

        System.out.println(obj.add(50,100));
    }
}
