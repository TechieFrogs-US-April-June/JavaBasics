package BeginnersAssignment.Abstract;

//Regular class extends abstract class
public class ChildSumAbstractCls extends ParentSumAbstractCls {

    /* If I don't provide the implementation of these two methods, the
     * program will throw compilation error.
     */
    public int sumOfTwo(int num1, int num2){
        return num1+num2;
    }
    public int sumOfThree(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {
        ChildSumAbstractCls obj = new ChildSumAbstractCls();
        System.out.println(obj.sumOfTwo(3, 7));
        System.out.println(obj.sumOfThree(4, 3, 19));
        obj.disp();
    }
}
