package Strings;

public class StringDemo {

        public static void main(String[] args) {
            String s1 = "abc";
            String s2 = "abc";
            String s3 = "ABC";
            String s4 = new String("ira");
            String s5 = new String("sria");
            String s6 = new String("diya");

            System.out.println("s1.hashcode.. "+s1.hashCode());
            System.out.println("s2.hashcode.. "+s2.hashCode());
            System.out.println("s3.hashcode.. "+s3.hashCode());

            System.out.println("== "+ (s1==s2));
            System.out.println(".equals "+s1.equals(s2));
            System.out.println("compare "+s1.compareTo(s2));//check string length and size and character
            System.out.println("equalsIgnoreCase "+ s1.equalsIgnoreCase(s2));

            System.out.println("== "+ (s1==s3));
            System.out.println(".equals "+s1.equals(s3));
            System.out.println("compare "+s1.compareTo(s3));
            System.out.println(".equalsIgnoreCase "+s1.equalsIgnoreCase(s3));

            System.out.println("== "+ (s4==s5));
            System.out.println(".equals "+s4.equals(s5));
            System.out.println("compare "+s4.compareTo(s5));
            System.out.println(".equalsIgnoreCase "+s4.equalsIgnoreCase(s5));
            System.out.println(s4.compareToIgnoreCase(s5));
            System.out.println(s4.compareToIgnoreCase(s6));

        }
    }
