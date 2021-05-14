package AccessModifiers;

public class TestAccess extends AccessModi {
    public static void main(String[] args) {

        //creating object for TestAccess class with extends(inheriting) AccessModi class in same package
        TestAccess taObj = new TestAccess();
        System.out.println(taObj.x);
        System.out.println(taObj.a);
        System.out.println(taObj.c);
        System.out.println(taObj.mymsg);
        System.out.println(taObj.num);
        System.out.println(taObj.value);

        //can't access private in another subclass in same package
        //System.out.println(taObj.sum);
        //System.out.println(taObj.name);
    }
}
