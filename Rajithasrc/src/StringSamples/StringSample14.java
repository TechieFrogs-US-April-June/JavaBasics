package StringSamples;

public class StringSample14 {
    
    public static void main(String[] args) {

        // create a string buffer
        StringBuffer str = new StringBuffer();
    
        // add string to string buffer
        str.append("Java");
        str.append(" is");
        str.append(" awesome.");
        System.out.println("StringBuffer: " + str);
    
        // clear the string
        // using new
        // here new object is created and assigned to str
        str = new StringBuffer();
        System.out.println("Updated StringBuffer: " + str);
      }
}
