package src.AbstractExercises;

abstract class Parent {
    void message(){
        System.out.println("This is Parent class" );
    }
}

class Child1 extends Parent{
     void message(){
         super.message();
          System.out.println("This is first subclass" );
    }
}

class Child2 extends Parent{
    void message(){
        super.message();
        System.out.println("This is second subclass");
    }
}

class MyAbstract{

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.message();

        Child2 c2 = new Child2();
        c2.message();


        
    }
}
