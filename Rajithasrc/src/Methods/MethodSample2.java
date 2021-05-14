package Methods;

class A{
    int i;
    public void printNum(){
        System.out.println("The value of interger i="+i);
    } 
}

class B extends A{
    int j;
    public void printNum(){
        System.out.println("The value of integer j="+j);
    }

}

public class MethodSample2 {

    public static void main(String[] args) {
        
        B b = new B();
        b.i=10;
        b.j=20;
        
        b.printNum();
    }
    
    

    
}
