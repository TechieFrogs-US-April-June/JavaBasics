package src.Polymorphism.MethodOverRiding;

public class Car extends Vehicle {

    //When same method present in parent class as well as child class with the same name and same number of parameters, is called Method Overriding
 
    //Start method
    public void start(){ 
        System.out.println("Car....Start ");
    }

    //stop method
    public void stop(){
        System.out.println("Car....Stop ");
    }

    //one more method
    public void refuel(){
        System.out.println("Car....refuel");
    }

    //public void theftSafety(){
      //  System.out.println("Car....theftSafety ");
    //}

    
}
