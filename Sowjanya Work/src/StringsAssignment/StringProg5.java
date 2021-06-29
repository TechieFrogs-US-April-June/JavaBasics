package StringsAssignment;

public class StringProg5 {
    public static void main(String[] args) {
        String s1 = "Ira";
        String s2 = "Sria";
        String s3 = new String("Ira");

        if(s1 == s2)
            System.out.println("is s1 == s2 ? true");
        else
            System.out.println("is s1 == s2 ? false");

        //System.out.println("s1==s2 is " +(s1==s2));

        if(s1 == s3)
            System.out.println("is s1 == s3 ? true");
        else
            System.out.println("is s1 == s3 ? false");
    }

}
