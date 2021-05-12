package src.InheritanceExercises.Counter;

public class counter {
     int i = 3;

     void increment(){
         System.out.println("print the value of Counter : " + i);
     }

    public static void main(String[] args) {
        
        counter countObj =new counter();
        countObj.increment();
    }
}
