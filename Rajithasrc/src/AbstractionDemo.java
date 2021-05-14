

abstract class MyAbstractClass{

    int i=10;
    void display(){
        System.err.println("In non abstract method");
    }

    abstract void myAbstractMethod();

    abstract int sum(int a,int b);


    final void showMsg(){
        System.out.println("In final method");
    }

    static void myMsg(){
        System.out.println("In static method");
    }

    MyAbstractClass(){
        System.out.println("In My Abstract Constructor");
    }

    MyAbstractClass(int i){
        System.out.println(i);
    }

   // public static void main(String[] args) {
     //   MyAbstractClass.myMsg();
       // AbstractionDemo abdobj = new AbstractionDemo(50);
        //abdobj.display();
        //abdobj.myAbstractMethod();

    //}

    
}

interface MultiInterface{
    void multiInfo();
}


abstract class NewAbstractClass extends MyAbstractClass implements MultiInterface{

    int a=20;
    //void display(){
      //  System.out.println("In New Abstract Class method ");
    //}

    void myAbstractMethod(){
        System.out.println("In Child abstract implementation");
    }

    
    abstract void newMethod();

}



public class AbstractionDemo extends NewAbstractClass {

    void myAbstractMethod(int a){

    }
    int sum(int a,int b){
        
        return a+b;
    }


    ///AbstractionDemo(int i){
     //super(i);
    //}

    
   // static void myMsg(){  //can over ride static method
     //   System.out.println("static myMsg method of child class");

   // }
     public static void main(String[] args) {
        AbstractionDemo absobj = new AbstractionDemo();
        //AbstractionDemo absobj = new AbstractionDemo(20);
          absobj.display();
          absobj.myAbstractMethod();
          System.out.println(absobj.sum(5,10));
     }

    
    void newMethod() {
       System.out.println("In new method");
        
    }
    @Override
    public void multiInfo() {
        // TODO Auto-generated method stub
        
    }
    
}
