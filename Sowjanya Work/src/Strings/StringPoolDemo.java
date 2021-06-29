package Strings;

public class StringPoolDemo {
    public static void main(String[] args) {


        User user1 = new User(1,"abc");
        User user2 = new User(1,"abc");

        System.out.println(user1);
        System.out.println(user2);

        //Object Comparision
        //== operator always checks if both the objects are pointing to the same memory location
        System.out.println(user1 == user2);

        //equals() in object class doesn't works same as string equals().
        //it checks for memory location same as == operator by default.
        //here the equals() is not overridden from object cls
        System.out.println(user1.equals(user2));


        String s1 = "abc";
        String s2 = "xyz";
        String s3 = "abc";
        String s4 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        //String Comparision
        //== operator always checks if both the objects are pointing to the same memory location
        System.out.println(s1 == s3);
        //.equals() checks for content in the strings.
        //bcoz equals() in string cls is overridden to compare the contents of the string
        System.out.println(s1.equals(s3));

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        //For strings it directly prints the values and not the object references
        System.out.println(s1);
        System.out.println(s4);
    }
}
