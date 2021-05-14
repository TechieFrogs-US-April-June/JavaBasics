

interface MyInterface{
    int i=10;
    void display();
    void showMsg();
    default void otherMethod(){
        System.out.println("In default method parent of MyInterface");
    }
}

interface NewInterface extends MultiInterface{
    int a=20;
    void newDisplay();
    void hello();
}

interface MultiInterface{
    void multiInfo();
}

interface Interface1 extends NewInterface,MultiInterface{
    int i=30;
    void newMethod();
    default void otherMethod(){
        System.out.println("In default method parent in Interface1");
    }
    static void myStaticMethod(){
    System.out.println("In Inerface Static method");
    }

}



abstract class MyAbstractClass1 implements MyInterface{


    abstract void myDisplay();
  
    public void display(){
        System.out.println("In display");
    }
}

public class InterfaceDemo  implements Interface1,MyInterface {

     void myDisplay(){

     }

     public void otherMethod(){
        System.out.println("In child default overriden");
        Interface1.super.otherMethod();
        MyInterface.super.otherMethod();
       

     }
     static void myStaticMethod(){

     }

     public void showMsg(){

     }
   //public void display(){
    //   System.out.println("In display");
   //}

   //public void showMsg(){
   //    System.out.println("In showMsg");
   //}

    public static void main(String[] args) {

        InterfaceDemo interfaceobj = new InterfaceDemo();
        System.out.println(NewInterface.a);
        //interfaceobj.display();
        interfaceobj.otherMethod();
        //interfaceobj.otherMethod1();
        Interface1.myStaticMethod();
        //interfaceobj.showMsg();
        
    }

    
    public void newMethod() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void newDisplay() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hello() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void multiInfo() {
        // TODO Auto-generated method stub
        
    }

    public void display(){

    }
    
}
