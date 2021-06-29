package src.AbstractExercises;

abstract class AbstractQ4 {

    //Constructor
    AbstractQ4(){
        System.out.println("This is constructor of abstract class");
    }

   //abstract method cannot have body
  abstract void a_method();

  //non abstract method
    void n_method(){
    System.out.println("This is a normal method of abstract class");
   }
}

class SubClass extends AbstractQ4{

    void a_method(){
        System.out.println("This is  method of abstract class");
       }

       public static void main(String[] args) {
           SubClass s = new SubClass();
           s.a_method();
           s.n_method();
       }

}
