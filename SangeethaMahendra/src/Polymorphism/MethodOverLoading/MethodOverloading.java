package src.Polymorphism.MethodOverLoading;

public class MethodOverloading {
     // same/Duplicate Mehod e.g same method name with same no of parameters are not allowed
     // you cannot careate a method inside a method
     //When the Method name is same with different input parameters within the same class is called Method Overloading
     // same method name with same no of parameters but with different DATA TYPES are  allowed
    public void sum(){ //0 input parameter
        System.out.println("Sum method...Zero param");
    }

    public void sum(int i){ // 1 input parameter
        System.out.println("Sum method...1 param ---> " + i);
        //System.out.println(i);
    }

    // same method name with same no of parameters but with different DATA TYPES are  allowed
    public void sum(double i){ // 1 input parameter
        System.out.println("Sum method...1 param ---> " + i);
        //System.out.println(i);
    }

    public void sum(int k, int n){ // 2 input parameter
        System.out.println("Sum method...2 param ====> " + k +" " + n);
        System.out.println(k+n);

    }

    //Main method can be over load with different parameters
    public static void main (int p){
    }

    public static void main(int p, int h){

    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(10, 5);
    }
    
}
