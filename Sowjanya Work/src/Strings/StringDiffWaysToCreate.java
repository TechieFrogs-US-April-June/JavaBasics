package Strings;

public class StringDiffWaysToCreate {
    public static void main(String[] args) {

        String s1 = "six";//stores in scp(string constant pool)

        String s2 = new String("seven");//stores in heap

        char c[] = {'a','e','i','o','u'};
        String s3 = new String(c);

        byte b[] = {65, 66, 67};
        String s4 = new String(b);

        System.out.println(s1+ "\n" +s2+ "\n" +s3+ "\n" +s4);

    }
}
