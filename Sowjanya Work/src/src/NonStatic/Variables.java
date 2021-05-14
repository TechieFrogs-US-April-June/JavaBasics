package NonStatic;

public class Variables {
    int a = 10;
    float f = 20.54f;
    char c = 'x';
    String str = "bfmngj";

    public static void main(String[] args) {
        Variables obj = new Variables();
        System.out.println("a = " +obj.a);
        System.out.println("f = " +obj.f);
        System.out.println("c = " +obj.c);
        System.out.println("str = " +obj.str);
    }

}
