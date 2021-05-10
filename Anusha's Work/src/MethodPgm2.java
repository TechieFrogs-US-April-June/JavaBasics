class Methods2 {
    void method1(int n, char c) {
        System.out.println("Given Parameters int and char are: "+n+" "+c);

    }

    void Method1(char c, int n) {
        System.out.println("Given Parameters Char and int are: "+c+" "+n);
    }

}

public class MethodPgm2 {
    int n;
    char c;
    public static void main(String[] args) {
        Methods2 methodObj=new Methods2();
        methodObj.method1(1,'q');
        methodObj.Method1('a',2);

    }
}
