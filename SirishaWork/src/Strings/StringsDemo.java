package SirishaWork.src.Strings;

public class StringsDemo {
    int no = 5;
    //integer number = new Integer("10");
    static String name = "Techie";
    static String str = new String("My New String");
    static String fname = "Techie";

    public static void main(String[] args) {

        name.concat("Frogs");//Techie Frogs
        name = name + "my company";
        fname = fname.concat("Turtles");
        //String s1 = "Saah";
        //String s2 = "AA";
        String s1 = "Sachin";
        //System.out.println(s2.compareToIgnoreCase(s3));
        //System.out.println(s1.compareTo(s2));
        //System.out.println(name+"   "+str+"   "+fname);

        int x = 20;
        String s2 = String.valueOf(x);
        s2 = "Welcome";
        //System.out.println(s1.startsWith("Ta"));
        s1 = s1.replace("Sachin" , "Tendulkar");
        //System.out.println();
        StringBuffer str1 = new StringBuffer();
        str1.append("Hi Team");
        StringBuffer str = new StringBuffer("Welcome my team");// 16+15 =31 - 31*2+2 = 62
        //str.append(" Team. How r u all. Hope all r good");
        //System.out.println(str.length());
        //System.out.println("My String is "+str.capacity());
        //str.insert(7 , "Greetings");
        //str.replace(0,7, "Greetings");
        //str.deleteCharAt(7);
        //str.delete(0, 7);
        //str.reverse();

        System.out.println(str);
    }
}
