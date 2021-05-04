package OOPS;


class CodeA{
    int i,j;
    void function1(int i){
        i = i+1;
        j = j+1;
        System.out.println(i);
        System.out.println(j);
    }

}
public class Test {
    public static void main(String[] args) {
        CodeA d1 = new CodeA();
        d1.function1(6);
        System.out.println(d1.i);
        System.out.println(d1.j);

    }
}
