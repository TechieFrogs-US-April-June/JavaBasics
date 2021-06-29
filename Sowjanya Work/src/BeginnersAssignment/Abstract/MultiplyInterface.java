package BeginnersAssignment.Abstract;

//Interface
public interface MultiplyInterface {

    //abstract methods
    public abstract int multiplyTwo(int n1, int n2);

    /* We need not to mention public and abstract in interface
     * as all the methods in interface are
     * public and abstract by default so the compiler will
     * treat this as
     * public abstract multiplyThree(int n1, int n2, int n3);
     */

    int multiplyThree(int n1, int n2, int n3);

    // Regular (or concrete) methods are not allowed in an interface(Except static and default from java 8)
    /*public void disp()
    {
        System.out.println("Regular method");
    }*/


}
