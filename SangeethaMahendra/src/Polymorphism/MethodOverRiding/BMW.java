package src.Polymorphism.MethodOverRiding;

public class BMW extends Car{ // has-a relationship

    //Start method same like car class
   public void start(){ //Overridden Method
        System.out.println("BMW....Start ");
   }

    // BMW class own method 
    public void theftSafety(){
        System.out.println("BMW....theftSafety ");
    }

   


    
}
