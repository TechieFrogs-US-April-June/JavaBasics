package src.Polymorphism.MethodOverRiding;

public class TestCar {
    public static void main(String[] args) {

        //whenever method is common both in parent & child class, the preference will be given to child class method
        //Static Polymorphism - Compile time polymorphism
        BMW b = new BMW();
        b.start(); // Output : BMW...Start (Excuted Child class start Method )
        b.stop();
        b.refuel();
        b.theftSafety();
        b.engine(); // can access grand parent properties
        System.out.println("***********");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        c.engine(); // can access  parent properties
       // c.theftSafety(); //the parent(car) cannot inherit from child(BMW) class
       System.out.println("***********");

         // Top Casting allowed - child class object referred by parent class ref variable
         Car c1 =  new BMW();   //Child class object can be referred by paernt class reference variable -- dynamic or Run time polymorphism 
         c1.start();  
         c1.stop();
         c1.refuel();
         c.engine(); // can access grand parent properties
         //c1.theftSafety(); //just using parents class reference varible to create child class object ref, this cannot access Child class properties
         //only overridden method, common methods and parent class methods will be called in dynamic polymorphism

         //Down Casting - Not allowed- cannot create parent class object ref referred by chld class reference variable
       //  BMW b1 =(BMW) new Car();  //Type mismatch: cannot convert from Car to BMW
        // the above possile but it gives runtime error : Exception in thread
        
        }
    
}
