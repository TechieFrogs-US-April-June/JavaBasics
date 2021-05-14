package ClassesAndObjects;
//main class
public class GFG {
    //main function
    public static void main(String[] args)
    {

        // First Complex number
        ClassesAndObjects.Complex C1 = new ClassesAndObjects.Complex(3, 2);

        // printing first complex number
        C1.printComplexNumber();

        // Second Complex number
        ClassesAndObjects.Complex C2 = new ClassesAndObjects.Complex(9, 5);

        // printing second complex number
        C2.printComplexNumber();

        // for Storing the sum
        ClassesAndObjects.Complex C3 = new ClassesAndObjects.Complex();

        // calling addComp() method
        C3 = C3.addComp(C1, C2);

        // printing the sum
        System.out.print("Sum of ");
        C3.printComplexNumber();

        // calling subtractComp() method
        C3 = C3.subtractComp(C1, C2);

        // printing the difference
        System.out.print("Difference of ");
        C3.printComplexNumber();
    }


}
