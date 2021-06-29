package StringsAssignment;

public class StringProg13 {
    public static void main(String[] args) {

       StringBuffer str = new StringBuffer();

        str.append("I");
        str.append("am");
        str.append("learning");
        str.append("java");
        System.out.println("StringBuffer: " +str);

        //clear the string using setLength()
        str.setLength(10);
        System.out.println("Updated StringBuffer: " +str);

    }
}
