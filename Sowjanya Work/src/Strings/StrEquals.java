package Strings;

public class StrEquals {
    public static void main(String[] args) {
        String st1 = "java language";
        String st2 = "java language";
        String st3 = "Java language";
        String st4 = new String("java language");
        String st5 = new String("jAva language");
        System.out.println(st1.equals(st2)); // True because content is same in st1 and st2
        System.out.println(st4.equals(st5)); // false bcoz content is not same in st4 and st5

        if (st1.equals(st3)) {
            System.out.println("both strings are equal");
        }else
            System.out.println("both strings are unequal");//content is not same in st1 and st3

        if(st2.equals(st4)) {
            System.out.println("both strings are equal");
        }else
            System.out.println("both strings are unequal");//content is same in st2 and st4

        String s = "SOWJI";
        System.out.println(s.equals("sowji"));// false bcoz case in not same

    }
}
