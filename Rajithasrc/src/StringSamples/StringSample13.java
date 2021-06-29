package StringSamples;

public class StringSample13 {
    public static void main(String[] args) {

        // create a string buffer
        StringBuffer str = new StringBuffer();
    
        // add string to string buffer
        str.append("Java");
        str.append(" is");
        str.append(" awesome.");
        System.out.println("StringBuffer: " + str);
    
        // clear the string
        // using setLength()
        str.setLength(0);
        System.out.println("Updated StringBuffer: " + str);
      }
    
    
}
