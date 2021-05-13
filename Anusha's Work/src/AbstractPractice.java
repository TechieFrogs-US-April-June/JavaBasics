abstract class abstract1{
    int a=10;
    void print() {
        System.out.println("Printing from non Abstract Method");
    }
    abstract  void print1();
    abstract void add(int a,int b);
    final void display(){
        System.out.println("In final Method");
    }
    static void display1(){
        System.out.println("In  Static Method");
    }
    abstract1(){
        System.out.println("In Abstract Constructor");
    }
    abstract1(int i){
        System.out.println(i);
    }
}

public abstract class AbstractPractice extends abstract1{
     AbstractPractice(int i){
       //  super(i);
     }
     void print1(){
         System.out.println("In Abtract Method");
     }
   /* int add(int a, int b){
         int sum=a+b;
        System.out.println(a+b);
        return sum;
    }*/
    public static void main(String[] args) {
       /* AbstractPractice absObj=new AbstractPractice(50);
        System.out.println(absObj.a);
       absObj.display();
       absObj.print();
       absObj.print1();
*/
    }
}
