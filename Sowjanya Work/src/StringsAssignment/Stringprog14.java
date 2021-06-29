package StringsAssignment;

public class Stringprog14 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("java is programming language");
        s1.append(" oops");
        System.out.println("StringBuffer: " +s1);

        //clear the string using new(new object is created and assigned to s1)
       s1 = new StringBuffer();
        System.out.println("Updated StringBuffer: " +s1);





    }
}
