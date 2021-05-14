package Methods;

public class MethodSample1 {

    void method1(int n,char c){
        System.out.println("Printing number and character  "+n+"     "+c);
    }

    void method1(char c,int n){
        System.out.println("Printing character and integer    "+c+"      "+n);
    }

    public static void main(String[] args) {
        MethodSample1 msobj = new MethodSample1();
        msobj.method1(5, 'y');
        msobj.method1('a', 4);

    }
    
}
