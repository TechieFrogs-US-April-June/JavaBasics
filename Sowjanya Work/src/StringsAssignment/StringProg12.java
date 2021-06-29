package StringsAssignment;

public class StringProg12 {
    public static void main(String[] args) {
        //creating string buffer
        StringBuffer str = new StringBuffer();

        //add string to string buffer
        str.append("my");
        str.append("name");
        str.append("is");
        str.append("sowji");
        System.out.println("StringBuffer: " +str);

        //clear the string using delete()
       // str.delete(0, str.length()); //clears given string from index 0 to complete length of the string
        str.delete(0,5);
        System.out.println("StringBuffer: " +str);
    }
}
