package StringsAssignment;

public class StringProg6 {
    public static void main(String[] args) {
        String str1 = new String();
        str1 = "abc";
        String str2 = "bcd";
        String str3 = new String("abc");
        String str4 = "abc";
        String str5 = new String("name");

        if(str1.equals(str2))
            System.out.println("is str1 equals(str2) ? true");
        else
            System.out.println("is str1 equals(str2) ? false");

        //System.out.println("str1 equals() str2 is " +str1.equals(str2));

        if(str1.equals(str3))
            System.out.println("is str1 equals(str3) ? true");
        else
            System.out.println("is str1 equals(str3) ? false");

        if(str3.equals(str4))
            System.out.println("is str3 equals(str4) ? true");
        else
            System.out.println("is str3 equals(str4) ? false");

        if(str3.equals(str5))
            System.out.println("is str3 equals(str5) ? true");
        else
            System.out.println("is str3 equals(str5) ? false");
    }
}
