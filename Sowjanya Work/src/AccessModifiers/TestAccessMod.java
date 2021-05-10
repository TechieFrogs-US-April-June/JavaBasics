package AccessModifiers;

public class TestAccessMod {
    public static void main(String[] args) {

        //Creating object for Accessmodi class in same package
        AccessModi am = new AccessModi();
        System.out.println(am.num);
        System.out.println(am.value);
        System.out.println(am.a);
        System.out.println(am.c);
        System.out.println(am.x);
        System.out.println(am.mymsg);

        //can't access private in another class in same package
        //System.out.println(am.sum);
        //System.out.println(am.name);

    }
}
