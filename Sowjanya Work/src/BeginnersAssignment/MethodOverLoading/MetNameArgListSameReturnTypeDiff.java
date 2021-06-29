package BeginnersAssignment.MethodOverLoading;

public class MetNameArgListSameReturnTypeDiff {

    //It will throw a compilation error: More than one method with same name and argument list
    // cannot be given in a class even though their return type is different.
    // Method return type doesn’t matter in case of overloading.

    /*public double myMethod(int num1, int num2)
    {
        System.out.println("First myMethod of class Demo");
        return num1+num2;
    }
    public int myMethod(int var1, int var2)
    {
        System.out.println("Second myMethod of class Demo");
        return var1-var2;
    }

    public static void main(String[] args) {
        MetNameArgListSameReturnTypeDiff obj2= new MetNameArgListSameReturnTypeDiff();
        obj2.myMethod(10,10);
        obj2.myMethod(20,12);

    }*/
}
