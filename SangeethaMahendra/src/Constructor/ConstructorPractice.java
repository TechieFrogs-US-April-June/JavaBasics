package src.Constructor;

public class ConstructorPractice {
    
    int a = 5;
    int b = 10;
    
    ConstructorPractice(){

    }
    
    
    public static void main(String[] args) {
    
     ConstructorPractice constructorObj = new ConstructorPractice(); //default constructor
     // constructorObj.a; // not accepting
    System.out.println(constructorObj.a); // accepted syntax
    System.out.println(constructorObj.b); 

    }
    
}
