public class StringsPgm {
    public static void main(String[] args) {
        String s1="JAVA";
        String s="java";
        String s4="java";
        String s5=new String("java");
        String s2=new String("Techie");
        System.out.println(s1);
        System.out.println(s2);
        char ch[]={'f','r','o','g','s'};
        String s3=new String(ch);
        System.out.println(s3);
       // to Compare Strings using equals()
        System.out.println(s.equals(s1));//false//equals method checks for only String literal which includes case of the string
        System.out.println(s.equalsIgnoreCase(s1));//true
        //to Compare Strings using ==
        System.out.println(s1==s4);//false//== method checks for reference value not string literal
        System.out.println(s==s4);//true
        System.out.println(s==s5);//false
        System.out.println(s4==s5);//false
        System.out.println(s1.equalsIgnoreCase(s4));//true
        s2=s2.concat("Frogs");
        System.out.println(s2);
        System.out.println(s1.compareTo(s4));//true-compareto() method checks for String length which includes case of the string
        System.out.println(s.compareTo(s4));//true

    }
}
