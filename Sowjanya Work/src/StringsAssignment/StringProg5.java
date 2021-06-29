package StringsAssignment;

public class StringProg5 {
    public static void main(String[] args) {
        String s1 = "Ira";
        String s2 = "Sria";
        String st = "Ira";
        String s3 = new String("Ira");
        String s4 = new String("Ira");
        String s5 = new String("abc");

        if(s1 == s2)
            System.out.println("is s1 == s2 ? true");
        else
            System.out.println("is s1 == s2 ? false");

        //System.out.println("s1==s2 is " +(s1==s2));

        if(s1 == s3) {
            System.out.println("is s1 == s3 ? true");
        }else
            System.out.println("is s1 == s3 ? false");

        if(s1 == st) {
            System.out.println("is s1 == st ? true");
        }else
            System.out.println("is s1 == st ? false");

        if(s3 == s4) {
            System.out.println("is s3 == s4 ? true");
        }else
            System.out.println("is s3 == s4 ? false");

        if(s2 == s3) {
            System.out.println("is s2 == s3 ? true");
        }else
            System.out.println("is s2 == s3 ? false");

        if(s4 == s5) {
            System.out.println("is s4 == s5 ? true");
        }else
            System.out.println("is s4 == s5 ? false");
    }

}
